package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class CartSystem extends TheSystem{
    public CartSystem() throws FileNotFoundException {
    }
    public void display() {
      //Fill the code here
        double total=0;
        double subTotal=0;
        double tax=0;
        double taxPlusSubtotal=0;
        for(Map.Entry<String, Item> item: this.getItemCollection().entrySet()){
            subTotal = item.getValue().getQuatity()* item.getValue().getItemPrice();
            tax = subTotal*.05;
            total = tax+subTotal;


            System.out.println(item.getValue().getItemName()+"    "+item.getValue().getQuatity()+"    "+"    "+subTotal +"   "+tax +"   "+total);

        }
        System.out.println();
    }

}
