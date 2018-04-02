package Assignment_for_04_03_2018;
import java.util.Scanner;
public class ExecuteStudent {

    public static void main(String [] args){

        Scanner userIn = new Scanner(System.in);
        Students stu1 = new Students();
        stu1.setName(userIn);
        stu1.setGPA(userIn);
        stu1.setGrade(userIn);
        Students stu2 = new Students();
        stu2.setName(userIn);
        stu2.setGPA(userIn);
        stu2.setGrade(userIn);
        Students stu3 = new Students();
        stu3.setName(userIn);
        stu3.setGPA(userIn);
        stu3.setGrade(userIn);
        System.out.println(stu1.returnAnswer()+"\n"+stu2.returnAnswer()+"\n"+stu3.returnAnswer());

        double avgGPA = (stu1.getGPA()+stu2.getGPA()+stu3.getGPA())/3;
        System.out.println("The average GPA for the three student is "+avgGPA);
    }
}
