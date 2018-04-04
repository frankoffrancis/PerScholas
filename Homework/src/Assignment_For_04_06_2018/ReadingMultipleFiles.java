package Assignment_For_04_06_2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingMultipleFiles  {

    public static void main(String[] args) throws IOException {
           try{
               String a=" ",d= " ";
        // file for courseCode
        String courseCode = "C:\\Users\\Students\\Desktop\\courseCode.txt";
        File couseNum = new File(courseCode);
        Scanner uInput  = new Scanner(couseNum);
        String coruseNa = "C:\\Users\\Students\\Desktop\\courseName.txt";
        File codeName = new File(coruseNa);
        Scanner usInput = new Scanner(codeName);
        ArrayList<String> words = new ArrayList<String>();
               ArrayList<String> word = new ArrayList<String>();
        while(uInput.hasNextLine() && usInput.hasNextLine() ){
            words.add(uInput.nextLine());
            word.add(usInput.nextLine());
        }

        for(String b : words) {


        }
    }
     catch (FileNotFoundException e){

        System.out.println("File not found");
        e.printStackTrace();
    }
}
}
