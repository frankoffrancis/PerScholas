package Assignment_For_03_29_2018;
import java.util.Scanner;
public class Coordinates_Plane {

    public static void main(String[] args){

        int x,y;
        Scanner userInput = new Scanner(System.in);

        System.out.println("what is the max value of X");
        x = userInput.nextInt();
        System.out.println("What is the max value of Y");
        y = userInput.nextInt();

        for (int i =0; i <=x ; i++ ){


          for(int j =0; j<=y; j++){
              System.out.println("("+i+","+j+")");
          }

        }
    }
}
