package cartSystemExample;

import com.sun.deploy.panel.ITreeNode;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class TheSystem {
    private HashMap<String, Item> itemCollection;

    protected TheSystem() throws FileNotFoundException {
        itemCollection = new HashMap<String, Item>();
        String[] lines;
        //Fill the code here
        if (getClass().getSimpleName().equals("AppSystem")) {
            File itemFiles = new File("sample.txt");
            BufferedReader readingItemsFile = new BufferedReader(new FileReader(itemFiles));
            try {
                while (readingItemsFile.ready()) {

                    String line = readingItemsFile.readLine();

                    Item item = readingFromLine(line);
                  itemCollection.put(item.getItemName(),item);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

        }
    }

    private Item readingFromLine(String line) {

        String[] holdingOptions = line.split("\\s ");
        Item options = new Item();
        options.setItemName(holdingOptions[0]);
        options.setItemDesc(holdingOptions[1]);

        options.setItemPrice(Double.parseDouble(holdingOptions[2]));


        options.setAvailableQuatity(Integer.parseInt(holdingOptions[3]));

        return options;

    }

    public HashMap<String, Item> getItemCollection() {
        //Fill the code here


        return new HashMap<String, Item>(itemCollection);
    }

    public void setItemCollection(HashMap<String, Item> copy) {
        //Fill the code her
        itemCollection = copy;
    }

    public Boolean add(Item item) {
        //Fill the code here
        if (this.itemCollection.containsKey(item.getItemName())) {
            Item Curernt = itemCollection.get(item.getItemName());
            if (Curernt.getAvailableQuatity() <= Curernt.getQuatity()) {
                return false;
            } else {
                return true;
            }

        } else {
            itemCollection.put(item.getItemName(), item);
            return true;
        }
    }

    public Item remove(String itemName) {
        //Fill the code here
        if (itemCollection.containsKey(itemName)) {
            return itemCollection.remove(itemName);
        } else {

             Item item = null;

             return item;
        }
    }

  /*
    */
    public Boolean checkAvailability(Item item, Integer current) {
      //Fill the code here
        if((item.getQuatity()+current)>item.getAvailableQuatity()){
        System.out.println("System is unable to add "+current+" "+item.getItemName()+"\nSystem can only add"+
                (item.getAvailableQuatity()-current)+" "+item.getItemName());
                return false;

        }
        return true;
    }

}
