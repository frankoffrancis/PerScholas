package homeworkOne;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ItemDAO item = new ItemDAO();
		item.getItemID(2);
	}
	
}
