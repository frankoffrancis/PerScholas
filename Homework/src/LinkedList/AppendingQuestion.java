package LinkedList;
import java.util.LinkedList;
public class AppendingQuestion {

    public static void main(String[] args){
        // Storing elements in a LinkedList  adn appending a specified element
        LinkedList<String> storingElements = new LinkedList<String>();
        storingElements.add("apple");
        storingElements.add("blue");
        storingElements.add("gray");
        storingElements.add("white");
        storingElements.addLast("Hello");
        System.out.println(storingElements);
    }
}
