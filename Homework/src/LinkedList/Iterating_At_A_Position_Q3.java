package LinkedList;

import java.util.LinkedList;

public class Iterating_At_A_Position_Q3 {

    public static void main(String[] args){
        // creating a list of emotions
        LinkedList<String>emotions = new LinkedList<>();
        // creating an object of the class EmotionTypes
        EmotionTypes feelings = new EmotionTypes();
        // getting all of the emotions in the tyeOfFeelings Method
        feelings.typesOfFeelings(emotions);
        // Show the type of emotions we have
        feelings.display(emotions);
        System.out.println();
        // displaying emotions from the 2 index and beyond
        feelings.startingPosition(emotions);

        }
    }

