package Assignment_For_03_29_2018;
        import java.util.Scanner;
public class Problem6 {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        double num1 = userInput.nextDouble();
        String symbol = userInput.next();
        double num2 =userInput.nextDouble();



        double total =0;
        if(num1!=0.0){
     while(true) {


         switch (symbol) {

             case "+":
               total = num1 +num2;
                 break;

             case "-":
                 total = num1 -num2;
                 break;

             case "*":
                 total = num1* +num2;
                 break;
             case "/":
                 total = num1 /num2;
                 break;
           }
           System.out.println("Your total is "+total);
         break;
        }

    }
    }
}
