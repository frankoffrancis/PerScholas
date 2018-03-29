package Assignment_For_03_30_2018;
import java.util.Scanner;
public class How_Many_Times {

    public static void main(String[] args){
        int[]ag= {1,1,13,3,3,5,6,6,6,10};
        int answer;
        int counter =0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("These are the numbers ");
        for(int i =0; i<ag.length; i++){
            System.out.print(ag[i]+", ");

        }
        System.out.println("What numbers do you want to search for");
        answer= userInput.nextInt();
        for (int i=0; i<ag.length; i++){

            if(answer == ag[i]){

                counter +=1;
            }
        }
        System.out.println("The number "+answer+" appears "+ counter+" time(s) in the array " );
    }
}
