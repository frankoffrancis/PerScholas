package LinkedList;

import java.util.LinkedList;

public class Insert_Elements_In_A_Position_Q9 {

    public static void main(String[] args){
        // adding areas to a list
        LinkedList<String>areas = new LinkedList<>();
        AreaListing places = new AreaListing();
        places.names(areas);
        places.display(areas);
        System.out.println();
        String []newAreas = {"Chicago", "Boston", "London"};
       places.addingNewNames(areas,newAreas);
 places.display(areas);
    }
}
