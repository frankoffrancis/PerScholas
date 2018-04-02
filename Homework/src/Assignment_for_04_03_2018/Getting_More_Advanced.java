package Assignment_for_04_03_2018;
import  java.util.Scanner;
public class Getting_More_Advanced {

    public static void main(String[] args){

        Scanner uInput = new Scanner(System.in);
        Students []student = new Students[3];
        for(int i = 0 ;i<student.length; i++) {
            student[i] = new Students();
        }
        double avgGPA=0;
        for(int i =0; i<student.length; i++){
            student[i].setName(uInput);
            student[i].setGPA(uInput);
            student[i].setGrade(uInput);
            avgGPA = student[i].getGPA()+avgGPA;
            student[i].returnAnswer();


        }
        System.out.println("The average GPA of the student is "+ avgGPA/3);
    }
}
