package LinkedList;

        import java.util.LinkedList;

public class Insert_In_Front_Q7 {

    public static void main(String[] args){
        //Creating a list for shapes
        LinkedList<String> kindOfShapes = new LinkedList<>();

        Shapes shapesTypes = new Shapes();
        // adding some shapes to the list
        shapesTypes.shapeTypes(kindOfShapes);
        // displaying the shapes in the list
        shapesTypes.display(kindOfShapes);
        System.out.println();
        // adding three new shapes in front of existing shapes
        String newShapes = "Octagon";
        // passing the new shape and adding it to the list but in the first position
        shapesTypes.addingFirstShape(kindOfShapes,newShapes);
        shapesTypes.display(kindOfShapes);
    }
}
