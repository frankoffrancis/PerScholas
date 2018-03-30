package Assignment_For_04_02_2018;

import java.util.Arrays;
import java.util.Scanner;

public class Movement_On_2DPlane {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String uAnswer, direction;
        String[][] board = new String[5][5];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "O";
            }
        }
        int row = 0, columns = 0;

        board[0][0] = "X";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.print("Do you want to start the game? y,n ");
        uAnswer = userInput.nextLine();
        while (uAnswer.equalsIgnoreCase("y")) {
            System.out.println("which direction do you want to move your avatar? up,down,left, or right");
            direction = userInput.nextLine();
            if (direction.equalsIgnoreCase("up")) {
                row -= 1;
                if (row >= 0) {

                    for (int i = 0; i < board.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board[row][columns] = board[i][j];
                            System.out.print(board[i][j]);
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("You cannot move there from your current position");
                }
            } else if (direction.equalsIgnoreCase("left")) {

                columns -= 1;

            } else if (direction.equalsIgnoreCase("right")) {

                columns = +1;
            } else if (direction.equalsIgnoreCase("down")) {

                row += 1;
                if (row >= 0) {

                    for (int i = 0; i < board.length; i++) {
                        for (int j = 0; j < board[i].length; j++) {
                            board[i][j]= board[row][columns]  ;
                            System.out.print(board[i][j]);
                        }
                        System.out.println();
                    }

                }
            }

        }

    }
}
