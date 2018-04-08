package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {
    String attendingLocation = "C:\\Users\\frank\\Desktop\\attending.csv\\";
    File attendingFile = new File(attendingLocation);
   public List<Attending> getAttending(){


        List<Attending> attendingList = new ArrayList<>();

        try{
            Scanner attendingReader = new Scanner(attendingFile);
            while(attendingReader.hasNextLine()){
                String [] allAttending = attendingReader.nextLine().trim().split(",");
                Attending a = new Attending(Integer.parseInt(allAttending[0]),allAttending[1]);
                attendingList.add(a);
            }
        }
        catch(IOException e){
            System.out.println("File not found");
        }
        return attendingList;
    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
        Boolean isEnrolled = false;

        for(Attending a : attending) {

            if (a.getStudentEmail().equals(studentEmail) && a.getCourseID() == courseID)
                isEnrolled = true;

        }
            if(isEnrolled==false){
                Attending newStudent = new Attending();
                newStudent.setCourseID(courseID);
                newStudent.setStudentEmail(studentEmail);
                attending.add(newStudent);

        }
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail) {

        List<Course> studentCourseList =new ArrayList<>();
        for (Course c : courseList) {

            for (Attending a : attending) {
                if (c.getID() == a.getCourseID() && studentEmail.equals(a.getStudentEmail())) {
                    studentCourseList.add(c);
                }
            }


        }
        return studentCourseList;

    }
    public void saveAttending(List<Attending> attending){

        try{
            FileWriter overWrite = new FileWriter(attendingFile,false);
                for(Attending change : attending){
                    overWrite.write(String.format("%s,%s,%s\r\n" ,change.getCourseID(), change.getStudentEmail()));
                }
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }

}
