package BasicInputAndOutputExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;

public class Question4 {

    public static void main(String[] args) {
        File numFile = new File("C:\\Users\\Students\\Desktop\\num1.txt");
        int total=0;

        try {
            BufferedReader reading = new BufferedReader(new FileReader(numFile));
            while(reading.ready()){
                String numInFile = reading.readLine();
                String []word = numInFile.split(" ");
                for (String value: word) {
                    int nums = Integer.parseInt(value);
                    total+=nums;
                }
            }
            System.out.println(total);
        }
        catch (IOException e){
                System.out.println("Can't find file");
        }
    }
}