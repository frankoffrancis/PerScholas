package Assignment_For_04_11_2018.CoreJava.Models;

public class Attending {

    private int courseID;
    private String email;

    public Attending(){

    }

    public Attending(int courseID, String email) {
        this.courseID = courseID;
        this.email = email;
    }

    public void setCourseID(int courseID){

        this.courseID=courseID;
    }

    public int getCourseID(){

        return courseID;
    }

    public void setStudentEmail(String studentEmail){

        this.email=studentEmail;
    }

    public String getStudentEmail(){

        return email;
    }

}
