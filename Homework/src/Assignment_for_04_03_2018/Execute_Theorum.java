package Assignment_for_04_03_2018;
import  java.util.Scanner;
public class Execute_Theorum {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        Pythagorean_Theorum [] maths =  new Pythagorean_Theorum[3];
        for(int i =0; i<maths.length; i++){

            maths[i] = new Pythagorean_Theorum();
        }

        for(int i =0; i<maths.length; i++){
            maths[i].setLeftSide(userInput);
            maths[i].setRightSide(userInput);
            System.out.println("The length of the third side is "+maths[i].getCal());
        }
    }
}
