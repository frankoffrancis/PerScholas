package CoreJava.Models;

public class Instructor {

	private int instructor_id;
	private String full_name;
	private String email;
	private String speciality;
	private int Student_role;
	private String pass;
	
	public Instructor() {
		
		
	}
	
	public Instructor (int id, String fNmae, String iEmail,String iSpec, int role, String iPass ) {
		this.instructor_id = id;
		this.full_name = fNmae;
		this.email = iEmail;
		this.speciality = iSpec;
		this.Student_role = role;
		this.pass = iPass;
		
	}
	public int getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getStudent_role() {
		return Student_role;
	}
	public void setStudent_role(int student_role) {
		Student_role = student_role;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	} 
	
	
}
