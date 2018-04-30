package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecords {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
	
		String delete = "delete from student "
				+ "where email =?";
		PreparedStatement stmt = conn.prepareStatement(delete);
		stmt.setString(1, "tim@gmail.COM ");
		stmt.executeUpdate();
		// execute Query is when we are selecting Everything else is Update
	}
}
