package Assignment_for_04_03_2018;

import java.util.Scanner;

public class Problem2 {
    private String name=" ";
    private int grade=0;
    private double GPA =0.0;
    Scanner uInput = new Scanner(System.in);

    public void setName(Scanner uInput){

        System.out.println("What is your name student");
        name = uInput.nextLine();


    }

    public void setGrade(Scanner uInput){

        System.out.println("What grade did you get student?");
        grade = uInput.nextInt();
        uInput.nextLine();
    }

    public double getGPA(){
        return GPA;
    }
    public void setGPA(Scanner uInput) {

        System.out.println("What was your GPA?");
        GPA =uInput.nextDouble();


    }
    public String returnAnswer(){
        String answer = "Student name is "+name+"\n";
        answer += name+" grade is "+grade+"\n";
        answer += name+" GPA is "+GPA;
        return  answer;
    }
}
