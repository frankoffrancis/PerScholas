package Assignment_For_04_10_2018;

import java.util.ArrayList;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){

        // declaring color as a String while wrapping it in an ArrayList
        ArrayList<String>colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        for(String cTypes : colors){
            System.out.println(cTypes);
        }
        Methods m = new Methods();
        // Iterating
        m.Iterting(colors);

        // updating
        m.update(colors,4, "Magenta");
        // removing
       m.removing(colors,3);
        for(String cTypes : colors){
            System.out.println(cTypes);
        }
        // Searching
        Scanner uInput = new Scanner(System.in);
        String colorSearch;
        System.out.println("Which color are you looking for");
        colorSearch=uInput.nextLine();
        if(m.searching(colors,colorSearch).equalsIgnoreCase(colorSearch)){
            System.out.println("We found your color : "+colorSearch);
        }
        else {
            System.out.println("We couldn't find your color");
        }
        //sorting
        //m.sorting(colors);
        // reverse
       System.out.print( m.reversing(colors));
    }
}
