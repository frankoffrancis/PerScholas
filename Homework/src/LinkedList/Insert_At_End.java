package LinkedList;

import java.util.LinkedList;

public class Insert_At_End {

    public static void main(String[] args){
        LinkedList<String>names = new LinkedList<>();
        names.add("Tom");
        names.add("Amy");
        names.add("Nick");
        String newName = "Sophia";
        names.addLast(newName);
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
