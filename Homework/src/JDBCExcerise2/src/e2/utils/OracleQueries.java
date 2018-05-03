package e2.utils;

public class OracleQueries {
	
	public static final String GETTING_ITEMS_IN_STOCK= "select * from item "
			+ "where quantity_in_stock > 0";
	
	public static final String UPDATESTOCK= "update item set "
			+ "quantity_in_stock =? "
			+ "where item_id=?";

}
