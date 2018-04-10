package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SimpleMenuRunner {
    public static void main(String[] args){
        Map<String,Double> menu = new HashMap<String, Double>();
        menu.put("Hamburger", 5.00);
        menu.put("Hot Dog", 2.90);
        menu.put("Sandwiches", 3.00);
        menu.put("Soda", 1.00);
        menu.put("Fries", 1.50);
        System.out.println("Menu\t\tPrice");
        for(Map.Entry<String, Double> loop : menu.entrySet()){
            System.out.println(loop.getKey()+"\t\t"+loop.getValue());
        }
        Map<String, Integer>cart = new HashMap<String, Integer>();
        cart.put("Hamburger", 3);
        cart.put("Hot Dog", 5);
        cart.put("Sandwiches", 7);
        cart.put("Soda", 4);
        cart.put("Fries", 3);

        Scanner uInput = new Scanner(System.in);
        String answer, answer1;
        int number;
        System.out.println("Your current cart");
        for(Map.Entry<String, Integer> l : cart.entrySet()){
            System.out.println(l.getKey()+"\t\t"+l.getValue());
        }
        System.out.println("Do you want to add an item");
        answer1= uInput.nextLine();
        if(answer1.equalsIgnoreCase("Yes")){
            System.out.println("What item do you want to add?");
            answer1 = uInput.nextLine();
            if(answer1.equalsIgnoreCase("Hamburger")||answer1.equalsIgnoreCase("Hot Dog")||answer1.equalsIgnoreCase("Sandwiches")||answer1.equalsIgnoreCase("Soda")||answer1.equalsIgnoreCase("Fries")){
                System.out.println("how much do you want to add");
                number = uInput.nextInt();
                if(cart.containsKey(answer1)){
                  int newCart=  cart.get(answer1)+number;
                    cart.put(answer1, newCart);

                }
                for(Map.Entry<String, Integer> l : cart.entrySet()){
                    System.out.println(l.getKey()+"\t\t"+l.getValue());
                }

            }


        }
        else{
                    System.out.println("Have a nice day");
        }
    }
}
