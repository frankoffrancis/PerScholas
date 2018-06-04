package people.utils;

public class OracleQueries {

	public final static String GETALLPEOPLE = "select * from people"; 
	public final static String GETPEOPLEBYID = "select * from people "
			+ "where people_id = ?";
	
	public final static String GETPEOPLEBYCOUNTY = "select * from people "
			+ "where county = ?";
	
	public final static String GETPEOPLEBYCITY = "select * from people "
			+ "where city = ?";
	
	public final static String GETPEOPLEBYLASTNAME = "select * from people "
			+ "where last_name = ?";
	
	public final static String DELTEPEOPLE= "delete from people "
			+ "where people_id = ?";
	
	public final static String SAVEPEOPLE = "insert into people (first_name, last_name, company_name, address, city, county, people_state, zip,phone, email )" + 
			"values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
	
	public final static String UPDATEPEOPLE = "update people "
			+ "set first_name = ?, "
			+ " last_name = ?, "
			+ " company_name = ?, "
			+ " address = ?, "
			+ " city = ?, "
			+ " county = ?, "
			+ " people_state = ?, "
			+ " zip = ?, "
			+ " phone = ?, "
			+ " email = ? ";
}
