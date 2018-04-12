package BasicInputAndOutputExercise;

import java.io.*;

public class IO_Method {

    public static void fileSelection(int fileNum){

        File puzzle;
        int counter =1;
        String message="";
        switch (fileNum){
            case 1:
                puzzle = new File("C:\\Users\\Students\\IdeaProjects\\Homework\\src\\BasicInputAndOutputExercise\\puzzle.txt");
                try {
                    BufferedReader readingPuzzle1= new BufferedReader(new FileReader(puzzle));
                    while (readingPuzzle1.ready()){

                      if(counter%3==0){
                          message+= (char)readingPuzzle1.read();

                      }else {
                          readingPuzzle1.read();
                      }
                        counter++;

                    }
                    if(readingPuzzle1 !=null){
                    readingPuzzle1.close();

                    System.out.println("The message is \n"+message);
                    }
                } catch (IOException e) {
                    System.out.println("File not found");
                }
            case 2:

        }
    }
    public static void main(String[] args){

        fileSelection(1);
    }
}
