package Assignment_For_04_02_2018;
import java.util.Scanner;
public class SumOfAColumn {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int column=0, holder=0;
        int[][] numbers = {{21,43,65},{76,454,652},{76,234,765}};

        System.out.println("These are the numbers." +"{21,43,65},{76,454,652},{76,234,765}");
              System.out.println(  "Which column do you like to find the sum in? ");

        for(int i=0; i<numbers.length; i++){
            for(int j =0; j<numbers[i].length; j++){
                }
            }
        column =userInput.nextInt();
            for (int i =0; i <numbers.length; i++){
                    holder = numbers[i][column]+holder;
            }
            System.out.println("The sum of column "+column+ " is " + holder);
        }
    }

