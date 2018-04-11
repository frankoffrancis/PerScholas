package LinkedList;

import java.util.LinkedList;

public class BuildingShapes {

    public void buildingDesign(LinkedList<String> shapes) {
        shapes.add("Triangle");
        shapes.add("Rectangle");
        shapes.add("Square");
        shapes.add("line");
    }

    public void display(LinkedList<String> shapes) {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));


        }
    }

    public void addNewType(LinkedList<String> shapes, String type) {
        for (int i = 0; i < shapes.size(); i++) {
            if (i == 2) {
                shapes.add(i, type);
            }
        }
    }
}