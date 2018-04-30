package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateCourseRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		
		String courseName = "Game Science";
		float minGPA= 1.89f;
		String insert = "insert into course ("
				+ "course_name,min_gpa)"
				+ "values(?,?)";
		
		PreparedStatement stmt= conn.prepareStatement(insert);
		stmt.setString(1, courseName);
		stmt.setFloat(2, minGPA);
		stmt.executeUpdate();
	}
}
