package Assignment_For_04_05_2018;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Reading_A_Single_File {

    public static void main(String[] args) throws IOException {

        try{
        // file location
        String location = "C:\\Users\\Students\\Desktop\\hello.txt";
        File firstFile = new File(location);
       Scanner uInput  = new Scanner(firstFile);
            ArrayList<String> words = new ArrayList<String>();

        while(uInput.hasNextLine()){
            words.add(uInput.nextLine());

        }

        for(String b : words){
            for(int i = b.length()-1; i >=0; i--){
                System.out.print(b.charAt(i));
            }
            System.out.println();
        }

    }
     catch (FileNotFoundException e){

            System.out.println("File not found");
            e.printStackTrace();
     }
    }
}
