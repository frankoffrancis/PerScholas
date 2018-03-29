package Assignment_For_03_30_2018;
import java.util.Scanner;
public class Find_The_Value_in_An_Array {

    public static void main(String[]args){

        int[]val = {1,2,3,4,5,6,7,8,9,10};
        int answer;
        Scanner userInput = new Scanner(System.in);
        System.out.println("These are the values in the array.");
        for(int i =0; i< val.length; i++){

            System.out.print(val[i]+", ");
        }
        System.out.println("what value do you want to search for?");
        answer=userInput.nextInt();

        for (int i =0; i<val.length; i++){

            if(answer == val[i]){

                System.out.println("Your answer was in the "+i+ " position of the array" );

            }

            }

        }

}
