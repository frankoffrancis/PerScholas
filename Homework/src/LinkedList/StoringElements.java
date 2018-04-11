package LinkedList;

import java.util.LinkedList;

public class StoringElements {
    public void holdingColors(LinkedList<String> storingElements){
        storingElements.add("apple");
        storingElements.add("blue");
        storingElements.add("gray");
        storingElements.add("white");
    }
    public void addingColor(LinkedList<String> storingElements){
        storingElements.add("Pink");
        storingElements.add("Purple");
        storingElements.add("Orange");
        storingElements.add("Brown");
    }
    public void display(LinkedList<String> storingElements){

            for(int i =0; i<storingElements.size(); i++){
                System.out.println(storingElements.get(i));

        }

    }
}
