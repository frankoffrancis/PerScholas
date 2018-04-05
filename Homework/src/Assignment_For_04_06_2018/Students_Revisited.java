package Assignment_For_04_06_2018;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class Students_Revisited {

    public static void main(String[] args){

        String namePath = "C:\\Users\\Students\\Desktop\\names.txt";
        String gradePath = "C:\\Users\\Students\\Desktop\\grades.txt";
        String gpaPath = "C:\\Users\\Students\\Desktop\\gpa.txt";


        File gpa = new File(gpaPath);
        File names = new File(namePath);
        File grades = new File(gradePath);

        try {
            Scanner nameRead = new Scanner(names);
            Scanner gradesRead = new Scanner(grades);
            Scanner gpaRead = new Scanner(gpa);

            Student[] studentsName = new Student[10];
            Student[] studentsGrade = new Student[10];
            Student[] studentsGPA = new Student[10];

            for(int i=0; i <studentsName.length; i++){
                studentsName[i] = new Student();
                studentsGPA[i] = new Student();
                studentsGrade[i] = new Student();

                studentsName[i].setName(nameRead.nextLine());
                studentsGrade[i].setGrade(gradesRead.nextInt());
                studentsGPA[i].setGpa(gpaRead.nextDouble());





            }
            for(int i =0; i<studentsName.length; i++){
                studentsName[i].getInfo( studentsName[i].getName(), studentsGrade[i].getGrade(),studentsGPA[i].getGpa());
            }

        }
        catch (IOException e){
            System.out.println("Wrong path");
        }

    }
}
