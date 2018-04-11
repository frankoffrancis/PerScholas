package LinkedList;

import java.util.LinkedList;

public class Color {
    public void names(LinkedList<String> color ){
        color.add("Blue");
        color.add("Red");
        color.add("Gray");
        color.add("White");
    }
    public void reverse(LinkedList<String> color){
        for(int i = color.size()-1; i>=0; i--){
            System.out.println(color.get(i));
        }
    }
    public void display(LinkedList<String> color){

        for(int i =0; i<color.size(); i++){
            System.out.println(color.get(i));

        }

    }
}
