package Assignment_For_04_10_2018;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods {

    public String Iterting(ArrayList<String> array){
        String val =" ";
        for(String b: array){
            val="Today's Color is "+b;
        }
        return val;
    }
    public String removing(ArrayList<String> array, int index){

        return array.remove(index);
    }
    public String searching(ArrayList<String> array, String searchingColor ){

        boolean isFound =false;
        String color =" ";
        for(String a : array){
            if(a.equalsIgnoreCase(searchingColor)){
                isFound=true;
            }

        }
        if(isFound == true ){
            color =searchingColor;
        }
        return color;
    }

    public void update(ArrayList<String> array,  String value ){
        int counter =0;

        for(String a : array){
            counter++;
            if(counter== 4){
                array.set(counter,value);
            }
        }


    }
    // get back to it.
    public void sorting(ArrayList<String> array) {

        Collections.sort(array);

    }

    public String reversing(ArrayList<String> array ){
        String holder= " ";
        int reverse = array.size()-1;

        for(int i= reverse; i >=0; i--){
            holder +=array.get(i);

        }
        System.out.println();
        return holder;
    }

    public ArrayList copying(ArrayList<String> array){

        ArrayList<String> array2 = new ArrayList<>();
        for(String a : array){

            array2.add(a);
        }
        return array2;
    }
    public ArrayList comparing(ArrayList<String> a,ArrayList<String> b ){
        ArrayList<String> holder= new ArrayList<>();
        for(String c : a ){
            if(b.contains(c)){
                holder.add(c);

            }
        }
        return holder;
    }
    public void looping (ArrayList<String> s){

        for(String a : s){
            System.out.println(a);
        }
    }

    public ArrayList appending(ArrayList<String> a,ArrayList<String> b){
        ArrayList <String>newArray = new ArrayList<>();
        b.addAll(a);
        return b;
    }
    public ArrayList convert(Integer i[]){

        ArrayList<Integer> newList = new ArrayList<Integer>(Arrays.asList(i));
        return newList;
    }
}






