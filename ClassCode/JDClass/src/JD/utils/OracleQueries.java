package JD.utils;

public class OracleQueries {

	public final static String GETUSERBYEMAIL ="Select * from user_table "
			+ "where email = ?";
	
	public final static String SAVEUSER = "insert into user_table "
			+ "(email, user_name, user_password) "
			+ "values (?,?,?)";
	public final static String UPDATEUSER = "UPDATE USER_TABLE SET "
			+ "USER_NAME = ?, USER_PASSWORD =? "
			+ "WHERE EMAIL = ?";
}
