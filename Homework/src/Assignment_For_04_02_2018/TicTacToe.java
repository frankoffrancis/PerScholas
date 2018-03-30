package Assignment_For_04_02_2018;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TicTacToe {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean game = true;
        String player1 = "x", player2 = "y";
        int row, column;
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                board[i][j] = " ";
            }
        }

        while (game == true) {
            System.out.println("what row do you want to place your mark Player One");
            row = userInput.nextInt();
            System.out.println("what column do you want to place your mark player one");
            column = userInput.nextInt();
            if (board[row][column] != " ") {
                System.out.println("That place has already been filled please try again");
                System.out.println("what row do you want to place your mark Player One");
                row = userInput.nextInt();
                System.out.println("what column do you want to place your mark player one");
                column = userInput.nextInt();
            }
            else {
                board[row][column] = player1;
            }
            System.out.println("Current board after Player One turn");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {

                    System.out.print(board[i][j]);
                }
                System.out.println();

            }
            System.out.println("what row do you want to place your mark Player Two");
            row = userInput.nextInt();
            System.out.println("what column do you want to place your mark player Two");
            column = userInput.nextInt();
            if (board[row][column] != " ") {
                System.out.println("That place has already been filled please try again");
                System.out.println("what row do you want to place your mark Player Two");
                row = userInput.nextInt();
                System.out.println("what column do you want to place your mark player Two");
                column = userInput.nextInt();
            } else {
                board[row][column] = player2;
            }

            System.out.println("Current board after Player Two turn");
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {

                    System.out.print(board[i][j]);
                }
                System.out.println();

            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {

                    if(board[i][j] !=" "){

                            game = false;
                    }
                    else {
                        game =true;
                    }
                }
                }

        }
    }
}



