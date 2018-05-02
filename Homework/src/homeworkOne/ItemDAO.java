package homeworkOne;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ItemDAO {

	
	public Item getItemID(int id) throws SQLException {
		
		
		Connection conn= null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		Item stuff =null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		
		String byID = "select * from item "
				+ "where item_id = ?";
		 stmt = conn.prepareStatement(byID);
		stmt.setInt(1, id);
		 result = stmt.executeQuery();
		  stuff = new Item();
		if(result !=null && result.next()) {
			
			stuff.setItem_id(result.getInt(1));
			stuff.setIteamName(result.getString(2));
			stuff.setItemPrice(result.getDouble(3));
			stuff.setItemInStock(result.getInt(4));
			
			
		}
		
		
	}catch (ClassNotFoundException | SQLException e){
		
	}finally {
		result.close();
		if(stmt!=null ) {
			stmt.close();
			
		}
		if(conn !=null) {
			conn.close();
		}
	}
		return stuff;
	}
	
	public List<Item> getItemsCostingGreaterThan(double price) throws SQLException{

		Connection conn= null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		Item stuff =null;
		 List<Item> highPriceItems =null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		 
		 String greaterThanPrice = "Select * from Item "
		 		+ "where item_price > ?";
		 stmt = conn.prepareStatement(greaterThanPrice);
		 stmt.setDouble(3, price);
		result = stmt.executeQuery();
		 highPriceItems = new ArrayList<Item>();
		 while(result.next()) {
			 Item item = new Item();
				stuff.setItem_id(result.getInt(1));
				stuff.setIteamName(result.getString(2));
				stuff.setItemPrice(result.getDouble(3));
				stuff.setItemInStock(result.getInt(4));
				highPriceItems.add(item);
		 }
	}catch(ClassNotFoundException | SQLException e) {
		
		}finally {
			result.close();
			if(stmt!=null ) {
				stmt.close();
				
			}
			if(conn !=null) {
				conn.close();
			}
		}
		return highPriceItems;
	}
	
	public List<Item> getItemsInStock() throws SQLException{
		
		Connection conn= null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		Item stuff =null;
		 List<Item> moreThanOne =null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "franklyn", "password");
		 
		 String hasStock = "Select * from Item "
		 		+ "where quanity_in_STOCK > 0) ";
		 stmt = conn.prepareStatement(hasStock);
		
		result = stmt.executeQuery();
		 moreThanOne = new ArrayList<Item>();
		 while(result.next()) {
			 Item item = new Item();
				stuff.setItem_id(result.getInt(1));
				stuff.setIteamName(result.getString(2));
				stuff.setItemPrice(result.getDouble(3));
				stuff.setItemInStock(result.getInt(4));
				moreThanOne.add(item);
		 }
	}catch(ClassNotFoundException | SQLException e) {
		
		}finally {
			result.close();
			if(stmt!=null ) {
				stmt.close();
				
			}
			if(conn !=null) {
				conn.close();
			}
		}
		return moreThanOne;
	}
}
