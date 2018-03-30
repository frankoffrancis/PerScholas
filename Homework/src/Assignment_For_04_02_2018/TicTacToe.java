package Assignment_For_04_02_2018;

import java.util.Scanner;

public class TicTacToeVer2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean game = true;
        int row, column;
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                board[i][j] = " ";
            }
        }
        int count=0;
       mainLabel: while (game == true) {


                System.out.println("what row do you want to place your mark Player " + (count%2+1));
                row = userInput.nextInt();
                System.out.println("what column do you want to place your mark player " + (count%2+1));
                column = userInput.nextInt();
                if (row < 0 || row > board.length-1 || column < 0 || column > board[0].length-1) {
                    continue;
                }

                if (board[row][column] != " ") {
                    System.out.println("That place has already been filled please try again");
                    continue;
                } else if (count%2 ==0) {
                    board[row][column] = "X";
                    count++;
                } else {
                    board[row][column] = "Y";
                    count++;
                }

                if(count == board.length*board[0].length){

                    break mainLabel;

                }
                System.out.println("Current board after Player " + (count%2+1));
                for (int m = 0; m < board.length; m++) {
                    for (int j = 0; j < board.length; j++) {
                        System.out.print(board[m][j]);

                    }
                    System.out.println();


                }


            //}


        }
    }
}
