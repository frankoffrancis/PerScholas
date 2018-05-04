package homeworkOne;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Runner {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		ItemDAO item = new ItemDAO();
		List<Item> item1 = new ArrayList<Item>();
		item1 = item.getItemsInStock();
		
		for(Item i : item1) {
			System.out.println(i.getItem_id());
			System.out.println(i.getIteamName());
			System.out.println(i.getItemPrice());
			System.out.println(i.getItemInStock());
			
	
		}
	

	}
}
