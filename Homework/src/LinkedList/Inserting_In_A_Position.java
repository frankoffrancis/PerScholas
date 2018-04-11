package LinkedList;

import java.util.LinkedList;

public class Inserting_In_A_Position {

    public static void main(String[] arg){
         // adding different types of shapes
        LinkedList<String>shapes = new LinkedList<>();
        shapes.add("Triangle");
        shapes.add("Rectangle");
        shapes.add("Square");
        shapes.add("line");
        // adding the shape Trapezoid to 2 position
        for(int i=0; i<shapes.size(); i++){
            if(i== 2){
                shapes.add(i,"Trapezoid");
            }
           System.out.println( shapes.get(i));
        }

    }
}
