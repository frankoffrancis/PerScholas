package Assignment_For_04_02_2018;

import java.util.Arrays;
import java.util.Scanner;

public class Movement_On_2DPlane {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String uAnswer =" ";
        int row =0 , columns=0;
        char[][]plane = new char[5][5];
        for(int i=0; i <plane.length; i++){
            for(int j=0; j <plane.length; j++) {

                plane[i][j] = '0';
                }

            }
            plane[0][0] = 'X';
        boolean start = true;

        for(int i=0; i <plane.length; i++) {
            for (int j = 0; j < plane.length; j++) {

                System.out.print(plane[i][j]);
            }
            System.out.println();
        }

        startGame: while(start == true){

            System.out.println("Which direction do you want to move?"+"up,down,left,or right");

            uAnswer= userInput.nextLine();

            switch (uAnswer ){

                case "up":
                    row--;

               case "down":
                   row++;

               case "left":
                   columns--;

               case "right":
                   columns++;

               default :
                    System.out.println("You entered the wrong direction. Please try again");
                    uAnswer=userInput.nextLine();

            }
            for(int i =0; i<plane.length; i++){
                for(int j =0; )

            }



            }
        }

    }

