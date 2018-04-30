package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpDateRecords {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
	
		String update= "update student set full_name = ?, "
				+ "major= ?, student_password = ?"
				+ "where email = ? ";
		PreparedStatement stmt = conn.prepareStatement(update);
		stmt.setString(1, "Franklyn Eze The Great");
		stmt.setString(2, "CS");
		stmt.setString(3, "password1");
		stmt.setString(4, "tim@gmail.COM ");
		stmt.executeUpdate();
		
		
	}

}
