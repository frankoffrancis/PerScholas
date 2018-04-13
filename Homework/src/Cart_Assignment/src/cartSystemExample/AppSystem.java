package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class AppSystem extends TheSystem {
    public AppSystem() throws FileNotFoundException {
    }
 public void display() {
        HashMap<String, Item> current = this.getItemCollection();
        //Fill the code here
      for(String s : current.keySet()){
          System.out.print(s);
      }

    }
 /*
    public Boolean add(Item item) {
        //Fill the code here
    }*/
}
