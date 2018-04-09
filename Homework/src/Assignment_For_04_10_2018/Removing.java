package Assignment_For_04_10_2018;

import java.util.ArrayList;

public class Removing {

    public static void main(String [] args){
        ArrayList<String> colors = new ArrayList<>(5);
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        Methods m = new Methods();
        m.removing(colors,2);


        for(String a: colors){
            System.out.println(a);

        }
    }
}
