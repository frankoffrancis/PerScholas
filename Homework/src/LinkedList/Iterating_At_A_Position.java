package LinkedList;

import java.util.LinkedList;

public class Iterating_At_A_Position {

    public static void main(String[] args){
        // adding different kinds of emotions
        LinkedList<String>emotions = new LinkedList<>();
        emotions.add("Happy");
        emotions.add("Sad");
        emotions.add("Content");
        emotions.add("Joy");
        emotions.add("Bliss");
        for(int i=0 ; i<emotions.size(); i++){
            // checking to see when i it greater than or equal to 2
            if(i >=2){
                // print out all of the element from the 2 position to the last one
              System.out.println(emotions.get(i));
            }
        }
    }
}
