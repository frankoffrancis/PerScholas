package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void addItem(Scanner scan, Map<String, Integer> checkoutCart) {
        int number=0;
        String item;

        System.out.println("What item do you want to add?");
        item = scan.nextLine();
        switch (item.toUpperCase()){

            case "HAMBURGER":
                System.out.println("how much do you want to add?");
                number = scan.nextInt();
                checkoutCart.put(item,  number);
                break;
            case "FRIES":
                System.out.println("how much do you want to add?");
                number = scan.nextInt();
                checkoutCart.put(item,  number);
                break;
            case "SANDWICH":
                System.out.println("how much do you want to add?");
                number = scan.nextInt();
                checkoutCart.put(item,  number);
                break;
            case "SODA":
                System.out.println("how much do you want to add?");
                number = scan.nextInt();
                checkoutCart.put(item,  number);
                break;
            case "HOT DOG":
                System.out.println("how much do you want to add?");
                number = scan.nextInt();
                checkoutCart.put(item,  number);
                break;
                default:
                    System.out.println("Wrong option");

        }

        }


    public static void viewOrder(Map<String, Integer> checkoutCart) {
       System.out.println("----------CART TOTAL---------");
        for (Map.Entry<String, Integer> l : checkoutCart.entrySet()) {

            System.out.println(l.getKey() + "\t\t" + l.getValue());
        }
        System.out.println("------------------------------");
    }

    public static void displayMenu(){
        Map<String, Double> menu = new HashMap<String, Double>();
        menu.put("Hamburger", 5.00);
        menu.put("Hot Dog", 2.90);
        menu.put("Sandwiches", 3.00);
        menu.put("Soda", 1.00);
        menu.put("Fries", 1.50);
        System.out.println("Menu\t\tPrice");
        for (Map.Entry<String, Double> loop : menu.entrySet()) {
            System.out.println(loop.getKey() + "\t\t" + loop.getValue());
        }
    }
}
