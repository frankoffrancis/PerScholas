package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CoreJava.Models.Student;
import CoreJava.systemsInterfaces.StudentDAOI;
import CoreJava.utils.OracleQueries;

public class StudentDAO implements StudentDAOI{

	@Override
	public Student getStudentByGmail(String email) throws SQLException {
		Student students = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			OracleConnection connecting = new OracleConnection();
			conn = connecting.getConnection();
			stmt= conn.prepareStatement(OracleQueries.GETSTUDENTBYGMAIL);
			
			stmt.setString(1, email);
			result = stmt.executeQuery();
			while(result!=null && result.next()) {
				students = new Student();
				students.setStudent_id(result.getInt(1));
				students.setFull_name(result.getString(2));
				students.setEmail(result.getString(3));
				students.setGpa(result.getDouble(4));
				students.setPass(result.getString(5));
				students.setStudent_role(result.getInt(6));
				
			}
		} catch (ClassNotFoundException  | IOException  | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			result.close();
			if(stmt!=null ) {
				stmt.close();
				
			}
			if(conn !=null) {
				conn.close();
			}
		}
		return students; 
		
	}
	
	public boolean validateUser(String passToValidate, String compareablePas) {
	
		boolean isValid= false;
		
			if (passToValidate.equals(compareablePas)) {
				
				isValid =true;
			}
			
	return isValid;
	}
	

}
