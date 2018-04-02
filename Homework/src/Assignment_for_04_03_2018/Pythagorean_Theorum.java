package Assignment_for_04_03_2018;
import java.util.Scanner;
import java.math.*;
public class Pythagorean_Theorum {
    private double leftSide;
    private double rightSide;
    private double cal;


    public void setLeftSide(Scanner uInput){

        System.out.println("What is the length of the left side of the triangle");
        leftSide = uInput.nextDouble();
    }
    public void setRightSide(Scanner uInput){

        System.out.println("What is the length of the right side of the triangle");
        rightSide = uInput.nextDouble();
    }
    public double getCal(){

        cal = Math.sqrt((leftSide*leftSide)+(rightSide*rightSide));
        return cal;
    }
}
