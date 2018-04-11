package LinkedList;

import java.util.LinkedList;

public class Inserting_At_First_And_Last {

    public static void main(String [] args){
        LinkedList<String> food = new LinkedList<>();
        food.add("Candy");
        food.add("Soup");
        food.add("Rice");
        food.add("Beans");
        food.add("Cake");
        food.add("Fruit");
        String []freshFruit = {"Apple","Banana"};
        String []unHealthyFood = {"Chips","Tacos"};
        // adding unhealthy food to the top of your food list
        for(int i=0; i<unHealthyFood.length; i++){
            food.addFirst(unHealthyFood[i]);
        }
        // adding fresh food to the last
        for(int i=0; i<unHealthyFood.length; i++){
            food.addLast(freshFruit[i]);
        }
    for(int i =0; i<food.size(); i++){
            System.out.println(food.get(i));
    }

    }
}
