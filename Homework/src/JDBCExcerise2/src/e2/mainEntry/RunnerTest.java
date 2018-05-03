package e2.mainEntry;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import e2.DAO.ItemDAO;
import e2.models.Item;

public class RunnerTest {

	public static void main(String []args)  throws SQLException, ClassNotFoundException, IOException {
		
		ItemDAO item = new ItemDAO();
		List<Item> item1 = new ArrayList<Item>();
		item1 = item.getItemsInStock();
		
		for(Item i : item1) {
			System.out.println(i.getItemID());
			System.out.println(i.getItemName());
			System.out.println(i.getItemPrice());
			System.out.println(i.getQuantity_in_stock());
			
		}
		

		
	}
}
