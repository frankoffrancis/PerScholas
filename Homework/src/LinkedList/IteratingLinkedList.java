package LinkedList;

import java.util.LinkedList;

public class IteratingLinkedList {

    public static void main(String[] args){
        // creating a linkList of color so that i can add different color types
        LinkedList<String> color = new LinkedList<>();
        color.add("Blue");
        color.add("Red");
        color.add("Gray");
        color.add("White");
        for(int i =0; i<color.size(); i++){
            System.out.println(color.get(i));
        }
    }
}
