package Assignment_For_03_30_2018;
import java.util.Scanner;
public class Largest_Value {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int size, value;
        System.out.println("What is the array");
        size = userInput.nextInt();
        int boxNum[] = {1,2,2,1,5,7,8,9,4,5};


        int maxValue = 0, minValue = 0;
        for (int i = 0; i < boxNum.length; i++) {
            if (boxNum[maxValue] < boxNum[i]) {

                maxValue = i;
            }

        }
        System.out.println("Max Value " +boxNum[maxValue] + " in the "+ " position");
    }
}