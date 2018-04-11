package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static HashMap.Menu.addItem;
import static HashMap.Menu.displayMenu;
import static HashMap.Menu.viewOrder;

public class MenuRunner {

    public static void main(String[] args) {
        boolean repeat = true;
        Map<String, Integer> cart = new HashMap<String, Integer>();
        while (repeat) {

            displayMenu();


            Scanner uInput = new Scanner(System.in);
            String answer;

            System.out.println("Do you want to add an item? Yes or No");
            answer = uInput.nextLine();
            if (answer.equalsIgnoreCase("Yes")) {
                addItem(uInput, cart);
                viewOrder(cart);
            } else {
                repeat = false;
                viewOrder(cart);
            }
        }


    }

}


