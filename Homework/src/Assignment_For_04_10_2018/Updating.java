package Assignment_For_04_10_2018;

import java.util.ArrayList;

public class Updating {
    public static void main (String[] args){
        ArrayList<String> colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        colors.set(4,"Magenta");
        for(String a: colors ){
            System.out.print(a+"\n");
        }

    }
}
