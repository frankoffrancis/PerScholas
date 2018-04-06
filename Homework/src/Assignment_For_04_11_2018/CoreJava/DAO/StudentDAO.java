package Assignment_For_04_11_2018.CoreJava.DAO;


import Assignment_For_04_11_2018.CoreJava.Models.Student;

import java.util.List;

public class StudentDAO {
    public List<Student>  getStudents(){
ArrayList<Student>  studentInSchool = new ArrayList<Student>();
        Student s = new Student();
        try {
            String studentLocation = "C:\\Users\\Students\\Desktop\\students.csv";
            File studentFile = new File(studentLocation);
            Scanner studentReader = new Scanner(studentFile);

            while(studentReader.hasNextLine()){
                String students = studentReader.nextLine();
                ArrayList<String[]> holder = new ArrayList<> ();
                holder.add(students.split(","));

                for(String[] holder1 : holder) {
                     s = new Student(holder1[0], holder1[1], holder1[2]);
                }
                studentInSchool.add(s);

            }

        }
        catch (Exception e){

            System.out.println("File not found.");
        }
        return studentInSchool;
    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){

    }

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){

    }
}
