package CoreJava.DAO;

import CoreJava.Models.Course;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {
    public List<Course> getAllCourses(){

        String courseLocation = "C:\\Users\\frank\\Desktop\\courses.csv";
        File courseFile = new File(courseLocation);
        List<Course> courseList = new ArrayList<>();

        try{
            Scanner courseReader  = new Scanner(courseFile);
            while(courseReader.hasNextLine()){

                String[] allCourses = courseReader.nextLine().split(",");
                Course c = new Course (Integer.parseInt(allCourses[0]),allCourses[1],allCourses[2]);
                courseList.add(c);

            }
        }
        catch(IOException e){
            System.out.println("File not found");
        }
        return courseList;

    }
}
