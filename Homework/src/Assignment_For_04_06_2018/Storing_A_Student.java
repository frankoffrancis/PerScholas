package Assignment_For_04_06_2018;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Storing_A_Student {

    public static void main(String [] args){

        String namePath = "C:\\Users\\Students\\Desktop\\names.txt";
        String gradePath = "C:\\Users\\Students\\Desktop\\grades.txt";
        String gpaPath = "C:\\Users\\Students\\Desktop\\gpa.txt";

        Student stu = new Student();

        String sName,grade, sGPA ;


        File names = new File(namePath);
        File grades = new File(gradePath);
        File gpa = new File(gpaPath);
        Scanner uInput = new Scanner(System.in);
        try{
            FileWriter writeName = new FileWriter(names,true);
            FileWriter writeGrades = new FileWriter(grades,true);
            FileWriter writeGPA = new FileWriter(gpa,true);
            System.out.println("What is the name of the student");
            sName = uInput.nextLine();
            System.out.println("What is grade is the student in");
            grade = uInput.nextLine();
            System.out.println("What is the GPA of the student");
            sGPA = uInput.nextLine();
            writeName.write(sName);
            writeGPA.write(sGPA);
            writeGrades.write(grade);
            writeGPA.close();
            writeGrades.close();
            writeName.close();
        }

        catch(IOException e){
            System.out.println("Wrong path");
        }
    }
}
