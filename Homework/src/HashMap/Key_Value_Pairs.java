package HashMap;

import java.util.HashMap;
import java.util.Map;
public class Key_Value_Pairs {

    public static void main(String[] args){
        Map<Integer,String> firstQuestion = new HashMap<Integer, String>();
        firstQuestion.put(1,"One");
        firstQuestion.put(2,"Two");
        firstQuestion.put(3,"Three");
        firstQuestion.put(4,"Four");
        firstQuestion.put(5,"Five");
        for(Map.Entry<Integer,String> s : firstQuestion.entrySet()){
            System.out.println(s.getKey()+" "+ s.getValue());
        }
        System.out.println();
            firstQuestion.put(2,"The new Star Wars movies are worst than the prequels");
            firstQuestion.put(4,"The iPhone is an overprice phone");
        for(Map.Entry<Integer,String> s : firstQuestion.entrySet()){
            System.out.println(s.getKey()+" "+ s.getValue());
        } 
        /**
         * The values for key 2 and 4 changed because I overwrote them.Since one key can only hold one value.
         */
    }

}
        
