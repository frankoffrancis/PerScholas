package SecondJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	public void getAllUsers() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		String all = "Select * from user_table";
		ResultSet result = null;
		PreparedStatement stmt = conn.prepareStatement(all);
		result= stmt.executeQuery();
		while(result!=null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
		}
	}
	public void getUserByEmail(String email) throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		String userEmail = "Select * from user_table "
				+ "where email = ?";
		PreparedStatement stmt = conn.prepareStatement(userEmail);
		stmt.setString(1, email);
		ResultSet result = stmt.executeQuery();
		
		if(result!=null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
		}
	}
	
	public void register(String userName, String password, String email ) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		String uName = userName ;
		String pass =password;
		String mail = email;
		String insert = "insert into user_table ("
				+ "email,user_name,user_password)"
				+ "values(?,?,?)";
		
		PreparedStatement stmt= conn.prepareStatement(insert);
		stmt.setString(1, email);
		stmt.setString(2, uName);
		stmt.setString(3, pass);
		stmt.executeUpdate();
		
	}


	public void login(String userName, String password) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
	String uName = userName;
	String pass =password;
	String loggingIn = "Select * from user_table "
			+ "where user_name=? and password=?";
	PreparedStatement stmt= conn.prepareStatement(loggingIn);
	stmt.setString(2, uName);
	stmt.setString(3, pass);

	stmt.executeUpdate();
	System.out.println("you are login");
	}
	public void upDate(String email) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
	
		String userAccount = "select * from user_table "
				+ "where email = ?"; 
		PreparedStatement stmt = conn.prepareStatement(userAccount);
		stmt.setString(1, email);
		ResultSet result = stmt.executeQuery();
		if(result!= null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getFloat(3));
		}
		
		
			/*String upDate = "update user_table set email=?, "
				+ "user_name=?, "
				+ "user_password=? ";
	
		PreparedStatement stmt = conn.prepareStatement(upDate);
		stmt.setString(1, email);
		stmt.setFloat(2, (float) 1.29);
		stmt.executeUpdate();*/
	}
}
