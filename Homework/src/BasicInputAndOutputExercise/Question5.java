package BasicInputAndOutputExercise;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args){

        int num =0;
        int total=0;
        Scanner userInput = new Scanner(System.in);

        System.out.printf("|%s%15s%15s%15s   |","1:num1 ","2: num2 ","3: num3 ","4: num4");
        System.out.println("\nPlease select the file that you want the total from");
        num = userInput.nextInt();
        UserInteraction fileSelect = new UserInteraction();
        fileSelect.fileSelection(num);
    }
}
