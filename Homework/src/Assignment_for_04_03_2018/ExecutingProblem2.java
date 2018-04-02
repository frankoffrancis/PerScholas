package Assignment_for_04_03_2018;
import  java.util.Scanner;
public class ExecutingProblem2 {

    public static void main(String[] args){

        Scanner uInput = new Scanner(System.in);
        Problem2 []student = new Problem2[2];
        double avgGPA;
        for(int i =0; i<student.length; i++){
            student[i].setName(uInput);
            student[i].setGPA(uInput);
            student[i].setGrade(uInput);
            avgGPA = student[i].getGPA()/3;
            student[i].returnAnswer();
            System.out.println("The average GPA of the student is "+ avgGPA);

        }

    }
}
