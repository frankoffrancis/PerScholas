package cus.utils;

public class OracleQueries {

	public final static String GETCUSTOMERBYID = "SELECT * FROM CUSTOMER "
			+ "WHERE CUSTOMER_ID = ?";
	public final static String ADDCUSTOMER = "Insert into customer("
			+ "customer_email,fname,lname)"
			+ "values("
			+ "???)";
}
