package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Printing_Out_Obe_By_One {
    public static void main(String[] args) {
        Map<Integer, String> firstQuestion = new HashMap<Integer, String>();
        firstQuestion.put(1, "One");
        firstQuestion.put(2, "Two");
        firstQuestion.put(3, "Three");
        firstQuestion.put(4, "Four");
        firstQuestion.put(5, "Five");

        for(int i=3; i <firstQuestion.size(); i++){
            System.out.println(firstQuestion);
        }
        for(Map.Entry<Integer,String> a : firstQuestion.entrySet()){
            System.out.println(a);
        }
    }
}
