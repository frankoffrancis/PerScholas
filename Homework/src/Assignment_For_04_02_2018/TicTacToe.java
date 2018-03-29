package Assignment_For_04_02_2018;

import java.util.Scanner;
public class TicTacToe {

    public static void main(String[] args){


        String[][]board= {{" "," "," "},{" "," "," "},{" "," "," "}};
        System.out.println("This is currently the board");
        System.out.println("{\" \",\" \",\" \"},\n{\" \",\" \",\" \"},\n{\" \",\" \",\" \"}");
        int row, column;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What row do you want your mark in?");
        row = userInput.nextInt();
        System.out.println("What column do you want your mark in?");
        column = userInput.nextInt();

        for (int i =0; i<board.length; i++){
            for(int j =0; j<board[i].length; j++){

                if (board[row][column].)
            }
        }


    }
}
