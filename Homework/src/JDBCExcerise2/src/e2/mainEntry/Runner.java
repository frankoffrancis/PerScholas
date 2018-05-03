package e2.mainEntry;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import e2.DAO.ItemDAO;
import e2.models.Item;

public class Runner {

	public static void main (String[] args) throws SQLException {
		
		int counter =4;
		while(counter <6) {
			displayMenu();
			counter++;
		}
		
	}
	
	public static void displayMenu() throws SQLException {
		
		ItemDAO item = new ItemDAO();
		List<Item> item1 = new ArrayList<Item>();
		item1 = item.getItemsInStock();
		System.out.printf("|%20s%20s%20s%20s    |\n", "ItemID","Item Name","Price","Quantity");
		for(Item i : item1) {
			
			System.out.printf("|%20s%20s%20s%20s    | \n", i.getItemID(),i.getItemName(),i.getItemPrice(),i.getQuantity_in_stock());
		}
	}
}
