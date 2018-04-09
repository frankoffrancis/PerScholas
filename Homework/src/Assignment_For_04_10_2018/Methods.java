package Assignment_For_04_10_2018;

        import java.util.ArrayList;
        import java.util.Collections;

public class Methods {

    public void Iterting(ArrayList<String> array){

        for(String b: array){
            System.out.println("Today's Color is ["+b+"]");
        }

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

    public String update(ArrayList<String> array, int index, String value ){

        return array.set(index,value);
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
}






