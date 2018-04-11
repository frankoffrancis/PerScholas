package BasicInputAndOutputExercise;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import  java.io.File;
public class Question3 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        String name;
        int grade;
        System.out.println("What is your name");
        name = userInput.nextLine();
        System.out.println("What was your grade on the math test");
        grade=userInput.nextInt();
        File mathFile = new File("C:\\Users\\Students\\Desktop\\score.txt");

        try {
            PrintWriter writeScore = new PrintWriter(mathFile);
            writeScore.write(name+" got a "+grade+" in the Math test.");
            writeScore.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
