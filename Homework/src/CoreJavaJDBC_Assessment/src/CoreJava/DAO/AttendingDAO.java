package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;
import CoreJava.systemsInterfaces.AttendingDAOI;
import CoreJava.utils.OracleQueries;
import CourseJava.CustomException.StudentRegistrationException;

public class AttendingDAO implements AttendingDAOI {

	@Override
	public int registerStudentToCourse(Student student, Course course) throws SQLException {
		
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		int id =0;
		String[] attendID = {"attending_id"};
		OracleConnection connecting = new OracleConnection();
		
		try {
			conn= connecting.getConnection();
			stmt= conn.prepareStatement(OracleQueries.REGISTERSTUDENTTOCOURSE,attendID);
	
			
			if(student.getGpa() >= course.getMinimum_gpa()) {
			
				stmt.setInt(1, course.getCourse_id());
				stmt.setInt(2, student.getStudent_id());
				
				stmt.executeUpdate();
				
				result = stmt.getGeneratedKeys();
				if(result !=null && result.next()) {
					
					id = result.getInt(1);
				}
			}
			else {
				StudentRegistrationException myException = new StudentRegistrationException("\nDid not meet the minimum GPA requirement"
						+ "\nRegistration Denied");
			
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			result.close();
			if(stmt!=null ) {
				stmt.close();
				
			}
			if(conn !=null) {
				conn.close();
			}
		}
		return id;
	}
	@Override
	public List<Attending> getStudentCourse(int student_id) throws SQLException{
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		List<Attending> inClass = null;
		Attending attend = null;
		
		OracleConnection connecting = new OracleConnection();
		
		try {
			conn = connecting.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETSTUDENTCOURSE);
			stmt.setInt(1, student_id);
			result = stmt.executeQuery();
			inClass = new ArrayList<Attending>();
			attend = new Attending();
			
			while(result!=null && result.next()) {
				attend.setCourse_name(result.getString(1));
				attend.setFull_name(result.getString(2));
				attend.setEmail(result.getString(3));
				inClass.add(attend);
				
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			result.close();
			if(stmt!=null ) {
				stmt.close();
				
			}
			if(conn !=null) {
				conn.close();
			}
		}
		return inClass;
		
	}
}
