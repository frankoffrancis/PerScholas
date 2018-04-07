package Assignment_For_04_11_2018.CoreJava.DAO;


import Assignment_For_04_11_2018.CoreJava.Models.Student;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class StudentDAO {
    public List<Student>  getStudents(){

        String sLocation = "C:\\Users\\frank\\Desktop\\students.csv";
        File sFile = new File(sLocation);

        ArrayList<Student> sList = new ArrayList<Student> ();
        try {
            Scanner sReader = new Scanner(sFile);

            while(sReader.hasNextLine()){

                String[] sHolder  = sReader.nextLine().trim().split(",");

                Student s = new Student(sHolder[0],sHolder[1],sHolder[2]);
                sList.add(s);
            }
        }
        catch (IOException e){

            System.out.println("File not found");
        }
        return sList;
    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){

       for(Student smail : studentList){

           if(smail.getEmail().equals(studentList)){

               return smail;
           }
       }

        return new Student();
    }
    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){

        for(Student sUser: studentList){

            if(sUser.getEmail().equals(studentEmail) && sUser.getPass().equals(studentPass)){

                return true;
            }
        }
        return false;
    }
}
