package Assignment_For_03_29_2018;

public class Problem5 {

    public static void main(String[] args){

        // way 1
        int x=10,y=10,z=10;
        for(; x<=20; x+=2){

            if (x == 16){
                continue;
            }
            System.out.println(x);
          }
        System.out.println();

        // way two
        for(; y<=20; y++){

            if (y == 16){
                continue;
            }
            if(y %2 ==0) {
                System.out.println(y);
            }
        }
        System.out.println();


        //3

            while(true){
                for(; z<=20; z++){
                    if(z%2==0){


                        if(z ==16){
                            continue;
                        }
                        System.out.println(z);
                    }


                }

                if(z==21){
                    break;
                }
            }

        }

    }

