package cartSystemExample;

        import java.io.FileNotFoundException;
        import java.util.HashMap;

public class AppSystem extends TheSystem {
    public AppSystem() throws FileNotFoundException {

    }

    public void display() {

        HashMap<String, Item> current = this.getItemCollection();
        //Fill the code here
        for (Item s : current.values()) {
            Integer itemAvailable = s.getAvailableQuatity();
            System.out.println("The current available choices are " + s.getItemName() + " " + s.getItemDesc() +
                    " " + s.getItemPrice() + "" + s.getAvailableQuatity());
        }

    }

    public Boolean add(Item item) {
        //Fill the code here
        boolean isAdded ;




            if (this.getItemCollection().containsKey(item.getItemName().toUpperCase())) {

                System.out.println("Item " + item.getItemName() + " is already in the system");

                isAdded = false;

            }

            HashMap<String, Item> addItems = this.getItemCollection();
            addItems.put(item.getItemName(), item);
            this.setItemCollection(addItems);
            isAdded = true;
            return isAdded;


    }
}
