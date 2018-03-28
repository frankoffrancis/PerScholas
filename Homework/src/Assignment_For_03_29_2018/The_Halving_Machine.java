package Assignment_For_03_29_2018;
import java.util.Scanner;
public class The_Halving_Machine {

    public static void main(String[] args) {

        int num;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a  number");
        num = userInput.nextInt();
        if (num >1) {

            for (int i = num; i !=1; i--) {

                if ((num % 2 == 0) && num > 1 ){

                    num /= 2;

                    System.out.println(num);



                }
                else if(num ==1){
                    break;

                }

                else {
                    num += 1;
                    num /= 2;
                    System.out.println(num);
                }

            }

        }
        else {
                System.out.println("HEY! That's against the rules");
            }

        }
    }

