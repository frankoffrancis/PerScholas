package Assignment_For_04_02_2018;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean game = true;
        String playerOneMark = "x", player2 = "y";

        int row, column;
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                board[i][j] = " ";
            }
        }

        while (game == true) {


            for (int i = 1; i <= 2; i++) {
                System.out.println("what row do you want to place your mark Player " + i);
                row = userInput.nextInt();
                System.out.println("what column do you want to place your mark player " + i);
                column = userInput.nextInt();
                if (row < 0 || row > 2 || column < 0 || column > 2) {
                    i -= 1;
                    continue;
                }

                if (board[row][column] != " ") {
                    System.out.println("That place has already been filled please try again");
                    i -= 1;
                    continue;
                } else if (i == 1) {
                    board[row][column] = playerOneMark;
                } else {
                    board[row][column] = player2;
                }
                System.out.println("Current board after Player " + i);
                for (int m = 0; m < board.length; m++) {
                    for (int j = 0; j < board.length; j++) {
                        System.out.print(board[m][j]);

                    }
                    System.out.println();
                    }

                }

            }
        }
    }
}
