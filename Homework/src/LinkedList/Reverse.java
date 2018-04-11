package LinkedList;

import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args){
        // creating a linkList of color so that i can add different color types
        LinkedList<String> color = new LinkedList<>();
        color.add("Blue");
        color.add("Red");
        color.add("Gray");
        color.add("White");
        // displaying the list in reverse
        for(int i = color.size()-1; i>=0; i--){
            System.out.println(color.get(i));
        }
    }
}
