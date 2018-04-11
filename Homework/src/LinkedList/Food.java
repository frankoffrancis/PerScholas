package LinkedList;

import java.util.LinkedList;

public class Food {

    public Food() {

    }

    public void foodTypes(LinkedList<String> food) {
        food.add("Candy");
        food.add("Soup");
        food.add("Rice");
        food.add("Beans");
        food.add("Cake");
        food.add("Fruit");
    }

    public void addingFirst(String newFood[], LinkedList<String> food) {
        for (int i = 0; i < newFood.length; i++) {
            food.addFirst(newFood[i]);
        }

    }

    public void addingLast(String newFood[], LinkedList<String> food) {
        for (int i = 0; i < newFood.length; i++) {
            food.addLast(newFood[i]);
        }
    }
    public void display(LinkedList<String> food){
        for(int i =0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}