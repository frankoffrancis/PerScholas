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
       System.out.println( m.Iterting(colors));

        // updating
        m.update(colors,"Magenta");
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
        m.sorting(colors);
        // reverse
        System.out.println ( m.reversing(colors));
        // copying
        System.out.println( m.copying(colors));
        // comparing
        ArrayList<String>  color2 = new ArrayList<>();
        color2.add("Green");
        color2.add("Orange");
        color2.add("Pink");
        color2.add("Yellow");
        System.out.println( m.comparing(colors,color2));

        //Appending
        System.out.println(m.appending(colors,color2));
        //looping
        m.looping(colors);
        // convert
        // I don't understand but i think i did it right
        Integer i[] ={1,2,7,5,5,3};
        m.convert(i);
        System.out.println(m.convert(i));
    }
}
