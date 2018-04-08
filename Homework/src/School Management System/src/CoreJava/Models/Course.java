package CoreJava.Models;

public class Course {

    private int id;
    private String name;
    private String Instructor;

    public Course(int id, String name, String instructor) {
        this.id = id;
        this.name = name;
        Instructor = instructor;
    }

    public Course(){


    }
    public void setID(int ID){

        this.id=ID;
    }

    public int getID(){

        return id;
    }

    public void setName(String name){

        this.name=name;
    }

    public String getName(){

        return name;
    }

    public void setInstructor(String instructor){

        this.Instructor=instructor;
    }

    public String getInstructor(){

        return Instructor;
    }

}
