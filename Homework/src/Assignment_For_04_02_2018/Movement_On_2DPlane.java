package Chp2;

import java.util.Arrays;
import java.util.Scanner;

public class Movement_On_2DPlane {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String uAnswer ;
        int row =0 , columns=0;
        final int LOWEST_BOUNDARY = 0;
        final int HIGHEST_BOUNDARY = 4;
        char[][]plane = new char[5][5];
        for(int i=0; i <plane.length; i++){
            for(int j=0; j <plane.length; j++) {

                plane[i][j] = '0';
            }

        }
        plane[row][columns] = 'X';

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

            switch (uAnswer.toUpperCase() ){

                case"UP":
                    if(row-1>=LOWEST_BOUNDARY){
                    plane[row][columns] = '0';
                    row--;
                    plane[row][columns] = 'X';
                }
                else{
                        //out of bounds
                        System.out.println("Out of bound");
                        start=false;
                    }

                    break;

                case"DOWN":
                    if(row <= HIGHEST_BOUNDARY){
                    plane[row][columns] ='0';
                    row++;
                    plane[row][columns] ='X';
                    }
                    else{
                        //out of bounds
                        System.out.println("Out of bound");
                        start=false;
                    }

                    break;
                case"LEFT":
                    if(columns -1 >=0){
                        plane[row][columns] ='0';
                        columns--;
                        plane[row][columns] = 'X';
                    }

                    else{
                        //out of bounds
                        System.out.println("Out of bound");
                        start=false;
                    }
                    break;
                case"RIGHT":
                    if(columns <=HIGHEST_BOUNDARY){
                        plane[row][columns] ='0';
                        columns++;
                        plane[row][columns] = 'X';
                    }
                    else{
                        //out of bounds
                        System.out.println("Out of bound");
                        start=false;
                    }
                    break;
                default :
                    System.out.println("You entered the wrong direction. Please try again");
                    uAnswer=userInput.nextLine();

                    break;
            }

                for(int i=0; i <plane.length; i++) {
                    for (int j = 0; j < plane.length; j++) {

                        System.out.print(plane[i][j]);
                    }
                    System.out.println();
                }
            }



        }
    }

