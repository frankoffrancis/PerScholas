package LinkedList;

import java.util.LinkedList;

public class EmotionTypes {
    public void typesOfFeelings(LinkedList<String>emotions  ){

        emotions.add("Happy");
        emotions.add("Sad");
        emotions.add("Content");
        emotions.add("Joy");
        emotions.add("Bliss");
    }
    public void startingPosition(LinkedList<String> emotions){
        for(int i=0 ; i<emotions.size(); i++){
            // checking to see when i it greater than or equal to 2
            if(i >=2){
                // print out all of the element from the 2 position to the last one
                System.out.println(emotions.get(i));
            }
        }
    }
    public void display(LinkedList<String> emotions){

        for(int i =0; i<emotions.size(); i++){
            System.out.println(emotions.get(i));

        }

    }
}
