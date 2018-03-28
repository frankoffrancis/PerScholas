package Assignment_For_03_30_2018;

public class Copy_Array {

    public static void main(String[]args){

        int[]first = {1,2,3,4,5,6,10,7,8,9,11};
        int [] second= new int[10];

        for (int i=0; i <= first.length-1; i++){
            second[i] = first[i];
            System.out.println(second[i] +" "+ first[i]);
        }
    }
}
