package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {
    public List<Student>  getStudents(){

        String fileLocation = "C:\\Users\\frank\\Desktop\\students.csv";
        File sFile = new File (fileLocation);
         List <Student> sList =  new ArrayList<>();

         try{
             Scanner studentReader = new Scanner(sFile);

             while(studentReader.hasNextLine()){
                 String[]allStudents = studentReader.nextLine().trim().split(",");
                 Student s = new Student(allStudents[0],allStudents[1],allStudents[2]);
                 sList.add(s);

             }
         }
         catch (IOException e){

             System.out.println("File not found");
         }
         return sList;
    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){

        Student sEmail = new Student();
        for(Student s : studentList){
            if(s.getEmail().equals(studentEmail)){
                sEmail = s;

            }
            else{

            }
        }
         return sEmail;
    }

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){

         boolean validStudent = false;
         for(Student s : studentList){
             if(s.getEmail().equals(studentEmail) && s.getPass().equals(studentPass)){
                 validStudent = true;
             }
             else{
                 validStudent = false;
             }
         }
         return validStudent;
    }
}
