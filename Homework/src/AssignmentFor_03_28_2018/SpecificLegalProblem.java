package AssignmentFor_03_28_2018;
import java.util.Scanner;
public class SpecificLegalProblem {

    public static void main(String[] args){

        int age;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your age?");
        age= userInput.nextInt();
        if(age <0 || age > 150){

            System.out.println("Invalid number. Please run the program again and enter a value between the range of 0 to 149 ");
        }
        else if (age >= 18  && age <25){
            System.out.println("You can't rent a car.");
        }
        else if (age >=16  && age <18){
            System.out.println("You can't vote.");
        }
        else if (age <16){
            System.out.println("You can't drive.");
        }
        else{
            System.out.println("You can do anything that's legal.");
        }
    }
}
