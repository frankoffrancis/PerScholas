package BasicInputAndOutputExercise;

import java.io.*;

public class Question2 {

    public static void main(String[] args){

        File postCardFile = new File("C:\\Users\\Students\\Desktop\\PostCard.txt");
        try {
            /*FileWriter postCard = new FileWriter(postCardFile);
            BufferedWriter postCardWritter = new BufferedWriter(postCard);*/
            PrintWriter postCardTime = new PrintWriter(postCardFile);
            postCardTime.write("+-----------------------------------------------------+"+"\r\n");
            postCardTime.printf("|%52s |\r\n","####");
            postCardTime.printf("|%52s |\r\n","####");
            postCardTime.printf("|%52s |\r\n","####");
            postCardTime.printf("|%53s|\r\n","" );
            postCardTime.printf("|%50s   |\r\n","" );
            postCardTime.printf("|%50s   |\r\n","Bill Gate" );
            postCardTime.printf("|%50s   |\r\n","1 Microsoft Way");
            postCardTime.printf("|%50s   |\r\n","Redmond, WA 98104");
            postCardTime.printf("|%50s   |\r\n","" );
            postCardTime.write("+-----------------------------------------------------+"+"\r\n");
            postCardTime.close();
        }
        catch (IOException E){
            System.out.print("File not found");
        }
    }
}
