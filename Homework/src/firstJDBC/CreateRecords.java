package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		// putting the library in a build path

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		
		// stuff you want to insert in the database. One way to do it 
		String fullName = "Tim Timmon";
		String email = "we@gmail.COM ";
		String major = "None";
		String password= "password";
		
		/*
		 * String insert = "INSERT INTO STUDENT "
				+ "(full_name, email, major,student_password) "
				+ "VALUES('"+fullName+"','"+email+"','"+major+"','"+password+"')";
		System.out.println(insert);
		Statement stmt= conn.createStatement();
		stmt.executeUpdate(insert);*/
		
		// Second way to insert data in the database 
		// create place holders
		// these are the columns of the database
		
		Integer iD= null;
		// the column must be auto generated 
		String [] col = {"student_id"};
		String insert= "Insert into student("
				+ "full_name,email, major, student_password)"
				+ "values(?,?,?,?)";
		// use the class call Prepare Statement 
		PreparedStatement stmt = conn.prepareStatement(insert,col);
		// the data type of the column in the table
		// setDatatype(position, variable you saved the data in)
		stmt.setString(1, fullName);
		stmt.setString(2, email);
		stmt.setString(3, major);
		stmt.setString(4, password);
		
		stmt.executeUpdate();
		
		ResultSet result = stmt.getGeneratedKeys();
		if (result != null && result.next()) {
			iD = result.getInt(1);
		}
		System.out.println(iD);
	}

}
