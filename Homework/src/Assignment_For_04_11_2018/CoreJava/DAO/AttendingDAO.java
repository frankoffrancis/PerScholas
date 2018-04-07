package Assignment_For_04_11_2018.CoreJava.DAO;

import Assignment_For_04_11_2018.CoreJava.Models.Attending;
import Assignment_For_04_11_2018.CoreJava.Models.Course;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {

    public List<Attending> getAttending(){

        ArrayList<Attending> attending = new ArrayList<Attending> ();
        String aLocation = "C:\\Users\\frank\\Desktop\\attending.csv";
        File aFile = new File(aLocation);
        try {

            Scanner aReader = new Scanner(aFile);
            while(aReader.hasNextLine()) {
                String[] attend = aReader.nextLine().trim().split(",");
                Attending a = new Attending(Integer.parseInt(attend[0]),attend[1]);

                attending.add(a);
            }
        }
        catch (IOException e){
            System.out.println("File not found");
        }
        return  attending;
    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){

        boolean sAttending = false;
        for(Attending a : attending){

            if(a.getStudentEmail().equals(studentEmail) && a.getCourseID() == courseID){

                sAttending = true;

            }
        }
            if(sAttending == false){
                Attending newStudent = new Attending(courseID, studentEmail);
                attending.add(newStudent);
                saveAttending(attending);
            }
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){

    }

    public void saveAttending(List<Attending> attending){

    }

}
