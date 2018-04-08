package CoreJava.MainEntryPoint;

import CoreJava.DAO.AttendingDAO;
import CoreJava.DAO.CourseDAO;
import CoreJava.DAO.StudentDAO;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentDAO object1 = new StudentDAO();
        List students =  object1.getStudents();
        object1.getStudentByEmail(students,"joe@gmail.com");
        CourseDAO object3 = new CourseDAO();
        List ot = object3.getAllCourses();
        AttendingDAO object2 = new AttendingDAO();
        List at = object2.getAttending();
       List total= object2.getStudentCourses(ot,at,"joe@gmail.com");

    }
    }
