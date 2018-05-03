package e2.models;

public class Item {

	private Integer itemID;
	private String itemName;
	private Integer quantity_in_stock;
	private Double itemPrice;
	
	public Integer getItemID() {
		return itemID;
	}
	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getQuantity_in_stock() {
		return quantity_in_stock;
	}
	public void setQuantity_in_stock(Integer quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

}
