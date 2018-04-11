package LinkedList;

import java.util.LinkedList;

public class First_Last_Occurrence_Q10 {

    public static void main(String[]args){
        // making a list of laptops
        LinkedList<String>laptops= new LinkedList<>();
        laptops.add("Dell");
        laptops.add("Mac");
        laptops.add("Surface");
        laptops.add("HP");
        System.out.println("The first Occurrence "+laptops.getFirst());
        System.out.println("The last Occurrence "+laptops.getLast());
    }
}
