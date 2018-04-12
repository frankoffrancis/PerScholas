package BasicInputAndOutputExercise;

import java.io.*;

public class Question7 {

    public static void main(String[] args){

        File crazyFile  = new File("C:\\Users\\Students\\Desktop\\CrazyText.txt");
        File crazyFileMod = new File("C:\\Users\\Students\\Desktop\\CrazyFileModified.txt");

        char[] vowels ={'a','e','i','o','u'};
        try {
            BufferedReader readingCrazy = new BufferedReader(new FileReader(crazyFile));
            BufferedWriter writinaSane = new BufferedWriter(new FileWriter(crazyFileMod));
            while(readingCrazy.ready()){

                char x =(char)readingCrazy.read();
                boolean hasVowel = false;
                for(char valueLoops : vowels){
                    if(valueLoops==Character.toLowerCase(x)){

                        writinaSane.write(Character.toUpperCase(x));
                    }
                    if(hasVowel){
                        writinaSane.write(x);
                    }
                }
            }
            if(readingCrazy!=null){
                    readingCrazy.close();
            }
            if(writinaSane!=null){
                writinaSane.close();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
