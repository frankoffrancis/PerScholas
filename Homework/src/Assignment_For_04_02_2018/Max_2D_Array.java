package Assignment_For_04_02_2018;

public class Max_2D_Array {

    public static void main(String[] args){
        int  num[][]={{541,2,3},{454,1395,5456},{54454,8454,954}
    };

        int max =0;
        int holder=0;

            for (int i =0; i <num.length; i++){
                for (int j =0; j<num[i].length; j++){

                    holder = num[i][j];
                    if (max< num[i][j]){

                        max = holder;
                    }
                }
            }
            System.out.println("The max value is "+ max);


    }


}
