package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Teaching;
import CoreJava.systemsInterfaces.TeachingDAOI;
import CoreJava.utils.OracleQueries;

public class TeachingDAO  implements TeachingDAOI{

	@Override
	public int assignInstructorToCourse (int course_id, int instructor_id) {
		
		Connection conn= null;
		PreparedStatement stmt= null;
		int returnValue=0;
		
		OracleConnection connecting = new OracleConnection();
		
		try {
			conn = connecting.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ASSIGNTEACHERTOCOURSE);
			stmt.setInt(1, course_id);
			stmt.setInt(2, instructor_id);
			returnValue= stmt.executeUpdate();
			
			if(returnValue !=0) {
				
				System.out.println("The teacher has been added to the course");
			}
			else{
				System.out.println("Can't update");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return returnValue;
	}

	@Override
	public List<Teaching> getInstructorsCourses() {
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		List<Teaching> listOfTeacher= null;
		
		OracleConnection connecting = new OracleConnection();
		
		try {
			conn = connecting.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETTEACHER);
			result =stmt.executeQuery();
			Teaching teach = new Teaching();
			listOfTeacher = new ArrayList<Teaching>();
			while( result.next()) {
				
				teach.setCourse_name(result.getString(1));
				teach.setMinimum_gpa(result.getDouble(2));
				teach.setFull_name(result.getString(3));
				teach.setEmail(result.getString(4));
				
				listOfTeacher.add(teach);
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listOfTeacher;
	}

}
