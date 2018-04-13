package cartSystemExample;

        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.util.HashMap;

public class AppSystem extends TheSystem {
    public AppSystem() throws FileNotFoundException {

    }
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
        //Fill the code here
        for(Item s : current.values()){
            System.out.println("The current available choices are "+s.getItemName()+" "+s.getItemDesc()+
                    " "+s.getItemPrice()+""+s.getQuatity());
        }

    }

    public Boolean add(Item item)  {
        //Fill the code here
        boolean isAdded = false;

        while(isAdded) {
            if (this.getItemCollection().containsKey(item.getItemName())) {

                System.out.println("Item "+item.getItemName()+ " is already in the system");

                isAdded= false;

            }
            else {
                this.add(item);
                isAdded=false;
            }
        }
        return isAdded;
    }
}
