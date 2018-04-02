package Assignment_for_04_03_2018;
import java.util.Scanner;
import java.math.*;
public class Area_Calcuator {

    private double pi = Math.PI;
    private double circle;
    private double radius;
    private double length;
    private  double width;
    private double side;
    private double square;
    private double height;
    private double base;
    private double triangle;
    private double rectangle;

    public void setAreaOfCircle(Scanner userInput){

        System.out.println("What is the radius of you circle");
        radius= userInput.nextDouble();
        circle = (radius*radius) *pi;
    }
    public void set_Area_Of_Rectangle(Scanner userInput){

        System.out.println("What is the length of the rectangle");
        rectangle = userInput.nextDouble();
        System.out.println("What is the width of the rectangle");
        width =userInput.nextDouble();
        rectangle = length*width;
    }
    public void set_Area_Of_Square(Scanner userInput) {

            System.out.println("What is the side of the square");
            side =userInput.nextDouble();
            square =side*side;
    }
    public void set_Area_Of_Triangle(Scanner userInput){
        System.out.println("What is the height of the triangle");
        rectangle = userInput.nextDouble();
        System.out.println("What is the width of the rectangle");
        width =userInput.nextDouble();
        rectangle = length*width;
    }

}

