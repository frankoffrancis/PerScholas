package Assignment_For_03_30_2018;
import java.util.Scanner;
public class Largest_Value {
    public static void main(String[] args) {



        int boxNum[] = {1,2,2,1,5,7,8,9,4,5};

        int index=0;

        int maxValue = 0, minValue = 0;
        for (int i = 0; i < boxNum.length; i++) {
            if (boxNum[maxValue] < boxNum[i]) {

                maxValue = i;
                index=i;
            }

        }
        System.out.println("Max Value is " +boxNum[maxValue] + " in the "+ index+"th position");
    }
}
