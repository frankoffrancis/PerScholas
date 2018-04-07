package Assignment_For_04_11_2018.CoreJava.DAO;

import Assignment_For_04_11_2018.CoreJava.Models.Course;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class CourseDAO {
    public List<Course> getAllCourses(){

        ArrayList<Course> courses = new ArrayList<Course> ();
        String cLocation = "C:\\Users\\frank\\Desktop\\courses.csv";
        File cFile = new File(cLocation);
        try {

            Scanner cReader = new Scanner(cFile);
            while(cReader.hasNextLine()) {
                String[] allCourse = cReader.nextLine().trim().split(",");
                Course c = new Course(Integer.parseInt(allCourse[0]),allCourse[1],allCourse[2]);

                courses.add(c);
            }
        }
        catch (IOException e){
            System.out.println("File not found");
        }
        return  courses;
    }
}
