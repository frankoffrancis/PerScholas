package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Instructor;
import CoreJava.systemsInterfaces.InstructorDAOI;
import CoreJava.utils.OracleQueries;

public class InstructorDAO implements InstructorDAOI{

	@Override
	public List<Instructor> getAllInstructors() throws SQLException{
		
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		List<Instructor> listOfTeachers = null;
		Instructor teacher = null;
		
		OracleConnection connecting = new OracleConnection();
		
		try {
			conn = connecting.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLINSTRUCTOR);
			result = stmt.executeQuery();
			listOfTeachers= new ArrayList<Instructor>();
			while(result!=null && result.next()) {
				teacher.setInstructor_id(result.getInt(1));
				teacher.setFull_name(result.getString(2));
				teacher.setFull_name(result.getString(3));
				teacher.setSpeciality(result.getString(4));
				teacher.setStudent_role(result.getInt(result.getInt(5)));
				teacher.setPass(result.getString(result.getString(6)));
				listOfTeachers.add(teacher);
				
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
		return listOfTeachers;
	}
	@Override
	public Instructor getInstructorByGmail(String email) throws SQLException {
		
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		Instructor teacher = null;
		
		OracleConnection connect = new OracleConnection();
		
		try {
			conn = connect.getConnection();
			stmt= conn.prepareStatement(OracleQueries.GETINSTRUCTORBYGMAIL);
			stmt.setString(1, email);
			result= stmt.executeQuery();
			
			if(result!=null && result.next()) {
				teacher = new Instructor();
				teacher.setInstructor_id(result.getInt(1));
				teacher.setFull_name(result.getString(2));
				teacher.setEmail(result.getString(3));
				teacher.setSpeciality(result.getString(4));
				teacher.setStudent_role(result.getInt(5));
				teacher.setPass(result.getString(6));
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
		return teacher;
	}
	
	public String validateUser(Instructor ins, String comparablePas) {
		String message= "";
		if(ins.getPass().equals(comparablePas)) {
			
			if(ins.getStudent_role() ==0) {
				message = "Instructor";
			}
			else {
				message = "Admin";
			}
		}
		else {
			message = "Wrong Credentials";
		}
		return message;
	}
}
