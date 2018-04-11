package LinkedList;

import java.util.LinkedList;

public class Reverse_Q4 {
    public static void main(String[] args){
        // creating a linkList of color so that i can add different color types
        LinkedList<String> colorType = new LinkedList<>();
        Color shades = new Color();
        shades.names(colorType);
        shades.display(colorType);
        System.out.println();
        // displaying the list in reverse
        shades.reverse(colorType);


    }
}
