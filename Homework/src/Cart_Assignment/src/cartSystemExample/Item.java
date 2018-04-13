package cartSystemExample;

public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Integer quatity;

    public Item(){
        quatity =1;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    public Integer getAvailableQuatity() {
        return availableQuatity;
    }

    public void setAvailableQuatity(Integer availableQuatity) {
        this.availableQuatity = availableQuatity;
    }

    private Integer availableQuatity;
    /**
     * @return the itemName
     */
  //Fill the code here
    public String toString(){
        return "name = "+getItemName()+" description = "+getItemDesc()+" price = "+getAvailableQuatity()+" price = "+getItemPrice();
    }
}
