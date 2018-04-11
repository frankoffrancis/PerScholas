package LinkedList;

import java.util.LinkedList;

public class Inserting_In_A_Position_Q5 {

    public static void main(String[] arg){
         // adding different types of shapes
        LinkedList<String>shapes = new LinkedList<>();
      BuildingShapes build = new BuildingShapes();
      // getting the old building shapes and displaying it
      build.buildingDesign(shapes);
      build.display(shapes);
        System.out.println();
        // adding the shape Trapezoid to 2 position
        String type = "Trapezoid";
        build.addNewType(shapes,type);
        // displaying the building shapes
        build.display(shapes);

    }
}
