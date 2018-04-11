package LinkedList;

import java.util.LinkedList;

public class Shapes {

    public void shapeTypes(LinkedList<String> shapes){

        shapes.add("Triangle");
        shapes.add("Rectangle");
        shapes.add("Square");
        shapes.add("line");
    }
    public void display(LinkedList<String> shapes){

        for(int i =0; i<shapes.size(); i++){
            System.out.println(shapes.get(i));

        }

    }
    public void addingFirstShape(LinkedList<String> shapes, String type){
        shapes.addFirst(type);
    }
}
