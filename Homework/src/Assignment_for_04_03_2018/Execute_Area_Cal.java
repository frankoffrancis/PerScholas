package Assignment_for_04_03_2018;
import java.util.Objects;
import java.util.Scanner;

public class Execute_Area_Cal {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        String answer;
        Area_Calcuator objects = new Area_Calcuator();
        System.out.println("Which object do you want to calculate the area of. Circle, rectangle, square, triangle");
        answer =userInput.nextLine();

        switch (answer.toUpperCase()){

            case "CIRCLE" :
                objects.setAreaOfCircle(userInput);
                System.out.println("The area of the circle is "+objects.get_Circle_Area());
                break;
            case "TRIANGLE" :
                objects.set_Area_Of_Triangle(userInput);
                System.out.println("The area of the triangle is "+objects.get_Triangle_Area());
                break;
            case "SQUARE" :
                objects.set_Area_Of_Square(userInput);
                System.out.println("The area of the square is "+objects.get_Sqaure_Area());
                break;
            case "RECTANGLE" :
                objects.set_Area_Of_Rectangle(userInput);
                System.out.println("The area of the rectangle is "+objects.get_Rectangle_Area());
                break;
                default:
                    System.out.println("Wrong input");
        }
    }
}
