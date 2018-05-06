package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Course;
import CoreJava.systemsInterfaces.CourseDAOI;
import CoreJava.utils.OracleQueries;

public class CourseDAO implements CourseDAOI {

	@Override
	public List<Course> getAllCourses() throws SQLException{
		
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		List <Course> allCourse = null;
		Course courses = null;
		
		OracleConnection connecting = new OracleConnection();
		
		try {
			conn = connecting.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLCOURSES);
			courses = new Course();
			result = stmt.executeQuery();
			allCourse= new ArrayList<Course>();
			while(result!=null && result.next()) {
				courses.setCourse_id(result.getInt(1));
				courses.setCourse_name(result.getString(2));
				courses.setMinimum_gpa(result.getDouble(3));
				allCourse.add(courses);
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
		return allCourse;
		
		 
	}
	
	public List<Course> getCourseByInstructor(int instructor_id) throws SQLException{
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		List <Course> allCourse = null;
		Course courses = null;
		
		OracleConnection connecting = new OracleConnection();
		try {
			conn = connecting.getConnection();
			stmt= conn.prepareStatement(OracleQueries.GETCOURSESBYINSTRUCTORID);
			stmt.setInt(1, instructor_id);
			result = stmt.executeQuery();
			courses = new Course();
			allCourse = new ArrayList<Course>();
			
			while(result!=null && result.next()) {
				courses.setCourse_id(result.getInt(1));
				courses.setCourse_name(result.getString(2));
				courses.setMinimum_gpa(result.getDouble(3));
				allCourse.add(courses);
				

				
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
		return allCourse;
	}


}
