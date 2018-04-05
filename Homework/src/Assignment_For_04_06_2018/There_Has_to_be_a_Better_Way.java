package Assignment_For_04_06_2018;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class There_Has_to_be_a_Better_Way {

    public static void main(String[] args){
        ArrayList<Student>last = new ArrayList<Student>();
        String studentPath = "C:\\Users\\Students\\Desktop\\Student.csv";
        File studentFile = new File(studentPath);

        try {
            Scanner inputFile = new Scanner(studentPath);
            inputFile.nextLine();
            while(inputFile.hasNextLine()) {
                String [] section = inputFile.nextLine().split(",");
                Student stu = new Student();
                stu.setName(section[0]);
                stu.setGrade(section[1]);
                stu.setGpa(section[2]);

                last.add(stu);
            }
            for(Student output : last) {

                System.out.println(output.getName());

            }



        }
        catch (Exception e) {

            System.out.println("File can't be file. Please check your file path");
        }
    }
}
