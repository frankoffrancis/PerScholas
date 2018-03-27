package AssignmentFor_03_28_2018;

import java.util.Scanner;
public class Legal_problems {

    public static void main (String[] args){

        // creating an object of the Scanner class so that it can take in the user's input
        Scanner userInput = new Scanner(System.in);
        // declaring the variable age is an Integer type and the variable name is a String type
        int age;
        String name;

        // asking the user a question about his/her name
        System.out.println("What is your name?");
        // saving the user response in the name variable
        name = userInput.nextLine();

        // asking the user about his/her age with the user name he/she gave
        System.out.println("How old are you "+name+ "?");
        // save the user age in the age variable
        age= userInput.nextInt();

        // using the if state statements to see if the user can drive, vote , and rent a car
        if(age <16){

            System.out.println("You can't drive,"+ name +".");
            System.out.println("You can't vote,"+ name +".");
            System.out.println("You can't rent a car,"+ name +".");
        }
        else if (age >=16 && age <18 ){

            System.out.println("You can't rent a car,"+ name +".");
            System.out.println("You can't vote,"+ name +".");
        }
        else if (age >=18 && age <25 ){

            System.out.println("You can't rent a car,"+ name +".");
        }
        else{

            System.out.println("You can do anything that's legal.");

        }


    }
}
