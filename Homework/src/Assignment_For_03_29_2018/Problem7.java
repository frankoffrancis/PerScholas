package Assignment_For_03_29_2018;

public class Problem7 {

    public static void main(String[] args) {


        //1
        // int x=4;
        for (int i = 0; i < 4; i++) {

            System.out.print("8");
            for (int j = 0; j < 7; j++) {
                System.out.print("8");

            }
            System.out.println();
        }
        System.out.println();


        //2

        int count = 4;

        for (int i = 1; i <= count; i++) {

            for (int j = count - i + 1; j >= 1; j--) {

                System.out.print("8");
            }

            System.out.println();
        }
        System.out.println();
        //3


        for (int i = 0; i <=5; i++) {

            for (int j = 5 -i; j >= 1; j--) {

                System.out.print(" ");
            }
            System.out.println("8");


        }
    }
}

