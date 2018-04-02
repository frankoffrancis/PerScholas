
public class Student {
	
	private int stuID;
	private String firstName;
	private String lastName;
	private String stuEmail;
	private String stuNum;
	
	public Student(int id, String fName,String lName,String sEmail,String sNum) {
		stuID = id;
		firstName = fName;
		lastName = lName;
		stuEmail = sEmail;
		stuNum = sNum.replace(' ', '-');
	}

	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String toString() {
		String message ="Student"+"\n";
		message += "ID: " +this.getStuID()+"\n";
		message += "First Name "+ this.getFirstName()+"\n";
		message += "Last Name: " +this.getLastName()+"\n";
		message += "Phone Number: "+ this.getStuNum()+"\n";
		message += "Email " +this.getStuEmail()+"\n";
	
		return message;
	}
	
	

}
