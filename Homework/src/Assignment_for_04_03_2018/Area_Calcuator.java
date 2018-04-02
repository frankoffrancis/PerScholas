package Assignment_for_04_03_2018;
import java.util.Scanner;
import java.math.*;
public class Area_Calcuator {

    private static double pi = Math.PI;
    private static double circle;
    private static double radius;
    private static double length;
    private static double width;
    private static double side;
    private static double square;
    private static double height;
    private static double base;
    private static double triangle;
    private static double rectangle;

    public void setAreaOfCircle(Scanner userInput) {

        System.out.println("What is the radius of you circle");
        radius = userInput.nextDouble();
        circle = (radius * radius) * pi;
    }

    public void set_Area_Of_Rectangle(Scanner userInput) {

        System.out.println("What is the length of the rectangle");
        length = userInput.nextDouble();
        System.out.println("What is the width of the rectangle");
        width = userInput.nextDouble();
        rectangle = length * width;
    }

    public void set_Area_Of_Square(Scanner userInput) {

        System.out.println("What is the side of the square");
        side = userInput.nextDouble();
        square = side * side;
    }

    public void set_Area_Of_Triangle(Scanner userInput) {
        System.out.println("What is the height of the triangle");
        height = userInput.nextDouble();
        System.out.println("What is the base of the triangle");
        base = userInput.nextDouble();
        triangle = height * base * .5;
    }

    public static double get_Circle_Area() {


        return circle;
    }
    public static double get_Rectangle_Area() {


        return rectangle;
    }
    public static double get_Sqaure_Area() {


        return square;
    }
    public static double get_Triangle_Area() {


        return triangle;
    }
}


