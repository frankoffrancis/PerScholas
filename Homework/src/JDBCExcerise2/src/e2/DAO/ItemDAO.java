package e2.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import e2.models.Item;
import e2.utils.OracleQueries;
public class ItemDAO {

	
	public  List<Item> getItemsInStock() throws SQLException{
		
		
		Connection conn= null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		List <Item> itemsOnHand= null;
		Item items = null;
		
		try {
			
			// create a connection with thw database 
			conn= OracleConnection.getConnection();
			 // the SQL command that will tell the program to only get items with more than 0

			stmt = conn.prepareStatement(OracleQueries.GETTING_ITEMS_IN_STOCK);
			result = stmt.executeQuery();
			 itemsOnHand = new ArrayList<Item>();
			while(result!=null && result.next()) {
				items = new Item();
				items.setItemID(result.getInt(1));
				items.setItemName(result.getString(2));
				items.setItemPrice(result.getDouble(3));
				items.setQuantity_in_stock(result.getInt(4));
				
				itemsOnHand.add(items);
			}
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
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
		
		return itemsOnHand;
	}
	
	public boolean updateQuantityInStock(int itemID, int newStockValue) {
		
		Connection conn = null;
		PreparedStatement stmt= null;
		ResultSet result = null;
		ResultSet result2 = null;
		Item items = new Item();
		boolean isUpdate=false;
			try {
				conn = OracleConnection.getConnection();
				stmt= conn.prepareStatement(OracleQueries.UPDATESTOCK);
				stmt.setInt(2, itemID);
				stmt.setInt(1, newStockValue);
				
				stmt.executeUpdate(); 
				result = stmt.executeQuery();
				items.setQuantity_in_stock(result.getInt(1));
				
				while(result!=null && result.next()) {
					if(items.getQuantity_in_stock()== newStockValue) {
						isUpdate = true;
						
					}
					
				}
				
				stmt.executeUpdate();
			} catch (SQLException | ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			return isUpdate;
	}
}
