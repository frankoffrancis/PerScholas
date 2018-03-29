package Assignment_For_03_30_2018;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class CommaSeparatedValues {

    public static void main(String[] args){

        String answer;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter some few words separated by commas ");
        answer= userInput.nextLine();
        String[] holding = answer.split(",");

        for(String i :holding){

            System.out.println(i);
        }


    }
}
