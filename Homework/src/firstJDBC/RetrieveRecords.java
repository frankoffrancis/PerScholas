package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveRecords {
// reading one or many records
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		
	/*	String byEmail = "Select * from student "
				+ "where email = ?";*/
		String byEmail = "Select * from student  ";
				
		PreparedStatement stmt = conn.prepareStatement(byEmail);
		/*stmt.setString(1, "tim@gmail.COM ");*/
		// resultSet 
		ResultSet result = stmt.executeQuery();
		while(result!= null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
			System.out.println(result.getString(5));
		}
	}

}
