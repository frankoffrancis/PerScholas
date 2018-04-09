package Assignment_For_04_10_2018;
import java.util.Scanner;
import java.util.ArrayList;

public class Searching {

    public static void  main(String[] args){
        ArrayList<String> colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        Scanner uInput = new Scanner(System.in);
        System.out.println("These are the color in Array list");
        for(String e : colors){
            System.out.println(e);
        }
        System.out.println("What color do you want to search for");
        String search =uInput.nextLine();
        Methods m = new Methods();

        System.out.println("The color "+search+" is in the " +m.searching(colors,search)+" index");

    }
}
