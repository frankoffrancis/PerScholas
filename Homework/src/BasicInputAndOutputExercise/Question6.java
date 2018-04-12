package BasicInputAndOutputExercise;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args){

        int choice =0;
        IO_Method run = new IO_Method();
        Scanner uInput = new Scanner(System.in);
        System.out.printf("|%15s%15s%15s  |","Please enter either 1 or 2 for the puzzle you want","1: Puzzle","2: Puzzle2");
        choice = uInput.nextInt();
        run.fileSelection(choice);
    }
}
