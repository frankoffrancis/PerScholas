package BasicInputAndOutputExercise;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserInteraction {

    public void fileSelection(int num){
        File userSelectedFile;
        int total=0;
        switch(num){
            case 1:
                userSelectedFile = new File("C:\\Users\\Students\\IdeaProjects\\Homework\\src\\BasicInputAndOutputExercise\\num1.txt");
                try {
                    BufferedReader reading = new BufferedReader(new FileReader(userSelectedFile));
                    while(reading.ready()){
                        String numInFile = reading.readLine();
                        String []word = numInFile.split(" ");
                        for (String value: word) {
                            int nums = Integer.parseInt(value);
                            total+=nums;
                        }
                    }
                    System.out.println("The total of the number of the file is "+ total);
                }
                catch (IOException e){
                    System.out.println("Can't find file");
                }
                break;
            case 2:
                userSelectedFile = new File("C:\\Users\\Students\\IdeaProjects\\Homework\\src\\BasicInputAndOutputExercise\\Num2.txt");

                        try {
                            BufferedReader reading = new BufferedReader(new FileReader(userSelectedFile));
                            while(reading.ready()){
                                String numInFile = reading.readLine();
                                String []word = numInFile.split(" ");
                                for (String value: word) {
                                    int nums = Integer.parseInt(value);
                                    total+=nums;
                                }
                            }
                            System.out.println("The total of the number of the file is "+total);
                        }
                        catch (IOException e){
                            System.out.println("Can't find file");
                        }
                        break;

            case 3:
                userSelectedFile = new File("C:\\Users\\Students\\IdeaProjects\\Homework\\src\\BasicInputAndOutputExercise\\num3.txt");
                try {
                    BufferedReader reading = new BufferedReader(new FileReader(userSelectedFile));
                    while(reading.ready()){
                        String numInFile = reading.readLine();
                        String []word = numInFile.split(" ");
                        for (String value: word) {
                            int nums = Integer.parseInt(value);
                            total+=nums;
                        }
                    }
                    System.out.println("The total of the number of the file is "+total);
                }
                catch (IOException e){
                    System.out.println("Can't find file");
                }
                break;

            case 4:
                userSelectedFile = new File("C:\\Users\\Students\\IdeaProjects\\Homework\\src\\BasicInputAndOutputExercise\\num4.txt");
                try {
                    BufferedReader reading = new BufferedReader(new FileReader(userSelectedFile));
                    while(reading.ready()){
                        String numInFile = reading.readLine();
                        String []word = numInFile.split(" ");
                        for (String value: word) {
                            int nums = Integer.parseInt(value);
                            total+=nums;
                        }
                    }
                    System.out.println("The total of the number of the file is "+total);
                }
                catch (IOException e){
                    System.out.println("Can't find file");
                }
                break;

            default:
                System.out.println("File not found");
        }

    }
}
