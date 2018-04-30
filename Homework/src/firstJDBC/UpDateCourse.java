package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpDateCourse {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		String upDate = "update course set course_name=?, "
				+ "min_gpa=? ";
	
		PreparedStatement stmt = conn.prepareStatement(upDate);
		stmt.setString(1, "Home Econ");
		stmt.setFloat(2, (float) 1.29);
		stmt.executeUpdate();
	}
}
