package cus.CustomerDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cus.Model.Customer;
import cus.utils.OracleQueries;

public class CustomerDAO {

	public Customer getCustomerByID(int id) throws SQLException {
		
		Customer cus = null;
		Connection conn= null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt= conn.prepareStatement(OracleQueries.GETCUSTOMERBYID);
		    stmt.setInt(1, id);
		    result = stmt.executeQuery();
		    
		    if(result!=null && result.next()) {
				System.out.println(result.getInt(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
		    }
		    else {
		    	System.out.println("Incorrect customer ID");
		    }
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			result.close();
			if(stmt!=null ) {
				stmt.close();
				
			}
			if(conn !=null) {
				conn.close();
			}
		}


		
		return cus;
	}
	
			
		public Integer addCustomer(Customer c) throws SQLException {
			Integer cusNum =null;
			Customer cus = null;
			Connection conn= null;
			PreparedStatement stmt = null;
			ResultSet result = null;
			String [] cusID = {"customer_id"};
			try {
				conn = OracleConnection.getConnection();
				stmt = conn.prepareStatement(OracleQueries.ADDCUSTOMER,cusID);
				stmt.setString(1, cus.customer_email);
				stmt.setString(2, cus.fName);
				stmt.setString(3, cus.lName);
				stmt.executeUpdate();
				
				result = stmt.getGeneratedKeys();
				
				if(result!=null && result.next()) {
					cusNum = result.getInt(1);
				}
			} catch (ClassNotFoundException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
			//	result.close();
				if(stmt!=null ) {
					stmt.close();
					
				}
				if(conn !=null) {
					conn.close();
				}
			}
			
			return cusNum;
		}
}
