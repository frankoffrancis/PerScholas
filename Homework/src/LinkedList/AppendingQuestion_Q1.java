package LinkedList;
import java.util.LinkedList;
public class AppendingQuestion_Q1 {

    public static void main(String[] args){
        // Storing elements in a LinkedList  adn appending a specified element
        LinkedList<String> storingElements = new LinkedList<String>();

      StoringElements elementsStorage = new StoringElements();

      elementsStorage.holdingColors(storingElements);
        elementsStorage.display(storingElements);
        System.out.println();
      elementsStorage.addingColor(storingElements);
      elementsStorage.display(storingElements);
    }

}
