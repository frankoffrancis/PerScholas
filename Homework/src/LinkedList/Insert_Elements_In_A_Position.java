package LinkedList;

import java.util.LinkedList;

public class Insert_Elements_In_A_Position {

    public static void main(String[] args){
        // adding areas to a list
        LinkedList<String>areas = new LinkedList<>();
        areas.add("Brooklyn");
        areas.add("Queens");
        areas.add("Bronx");
        areas.add("Manhattan");
        String []newAreas = {"Chicago", "Boston", "London"};
        for(int i =0; i<areas.size(); i++ ){
            if(i ==1){
                areas.add(i,newAreas[i]);
            }
        }
        for(int i=0; i <areas.size(); i++){
            System.out.println(areas.get(i));
        }
    }
}
