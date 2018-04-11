package LinkedList;

import java.util.LinkedList;

public class Inserting_At_First_And_Last_Q6 {

    public static void main(String [] args){
        //LIST OF FOOD
        LinkedList<String> food = new LinkedList<>();

        Food typesOfFood = new Food();
        // putting food in a list
        typesOfFood.foodTypes(food);
        // array of fresh fruit
        String []freshFruit = {"Apple","Banana"};
        // array of unhealthy food
        String []unHealthyFood = {"Chips","Tacos"};
        // adding the unhealthy food in front
        typesOfFood.addingFirst(unHealthyFood,food);
        // adding the fruits in the last position
        typesOfFood.addingLast(freshFruit,food);

        typesOfFood.display(food);

    }
}
