package LinkedList;

import java.util.LinkedList;

public class AreaListing {

    public void names(LinkedList<String> areas ){
        areas.add("Brooklyn");
        areas.add("Queens");
        areas.add("Bronx");
        areas.add("Manhattan");
    }
    public void addingNewNames(LinkedList<String> areas, String[] newNames){
        for(int i =0; i<areas.size(); i++ ){
            if(i ==2){
                for(String names : newNames)
                areas.add(i,names);
            }
        }
    }
    public void display(LinkedList<String> areas){

        for(int i =0; i<areas.size(); i++){
            System.out.println(areas.get(i));

        }

    }
}
