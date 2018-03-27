package AssignmentFor_03_28_2018;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int day;
        System.out.println("Please enter a number from 1 through 7 to see the corresponding day of the week?");
        day = userInput.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("Error");
        } else if (day == 1) {
            System.out.println("The day is Monday ");
        } else if (day == 2) {
            System.out.println("The day is Tuesday ");
        } else if (day == 3) {
            System.out.println("The day is Wednesday ");
        } else if (day == 4) {
            System.out.println("The day is Thursday ");
        } else if (day == 5) {
            System.out.println("The day is Friday ");
        } else if (day == 6) {
            System.out.println("The day is Saturday ");
        } else if (day == 7) {
            System.out.println("The day is Sunday ");
        }
    }
}