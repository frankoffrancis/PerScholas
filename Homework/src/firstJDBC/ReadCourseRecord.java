package firstJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadCourseRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		
		String courseName = "Select * from course "
				+ "where course_name=?";
		PreparedStatement stmt= conn.prepareStatement(courseName);
		stmt.setString(1, "Computer Science");
		ResultSet result = stmt.executeQuery();
		if(result!= null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getFloat(3));
		}
		
	}
}
