package Assignment_for_04_03_2018;

public class ExecuteDivisible {

    public static void main(String[] args) {

        Divisible start = new Divisible();

        for (int i = 1; i <= 20; i++) {


            if (i % 2 == 0) {
                System.out.println(i + " < " + start.isEven(i));
                if (i % 3 == 0) {
                    System.out.println(i + " = " + start.isDivisibleBy3(i));
                }
            }
                else if (i % 3 == 0) {

                    System.out.println(i + " = " + start.isDivisibleBy3(i));
                }
                else {
                    System.out.println(i + " ");
                }


        }
    }
}