package Assignment_For_03_30_2018;
import java.util.Scanner;
public class Find_The_Value_in_An_Array {

    public static void main(String[]args){

        int[]val = {1,2,3,4,5,6,7,8,9,10};
        int answer;
        Scanner userInput = new Scanner(System.in);
        System.out.println("These are the values in the array.");
        for(int i =0; i<= val.length-1; i++){

            System.out.println(val[i]);
        }
        System.out.println("what value do you want to search for?");
        answer=userInput.nextInt();

        for (int i =0; i<=val.length-1; i++){

            if(answer == val[i]){

                System.out.println("Your answer was in the array in "+i+ " position");

            }
            else {

                System.out.println("Your answer wasn't the "+i+ " position");

            }

            }

        }

}
