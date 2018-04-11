package LinkedList;

import java.util.LinkedList;

public class Insert_In_Front {

    public static void main(String[] args){
        // adding different types of shapes
        LinkedList<String> shapes = new LinkedList<>();
        shapes.add("Triangle");
        shapes.add("Rectangle");
        shapes.add("Square");
        shapes.add("line");
        // adding three new shapes in front of existing shapes
        String newShapes = "Octagon";
        shapes.addFirst(newShapes);
        // print out  all of the shapes
        for(int i =0; i<shapes.size(); i++){
            System.out.println(shapes.get(i));
        }


    }
}
