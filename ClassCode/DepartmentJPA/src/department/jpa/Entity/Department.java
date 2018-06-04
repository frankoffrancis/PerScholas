package department.jpa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="department_table")
public class Department {
	@Id
	@Column(name = "department_id")
	private int departmentID;
	@Column(name ="department_name")
	private String departmentName;
	@Column(name = "department_state")
	private String departmentState;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int departmentID, String departmentName, String departmentState) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.departmentState = departmentState;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentState() {
		return departmentState;
	}
	public void setDepartmentState(String departmentState) {
		this.departmentState = departmentState;
	}

}
