package test.jpa.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // tells jpa that this model is an entity
@Table(name = "JPA_Employee") // mapps the table in the database to the model 
public class Employee {
	@Id // Tells JPA  that the variable under it is the primary key in the database  
	@Column(name ="eid") // tells JPA that eid in the database is mapped to the variable under it. it they are named differently 
	private int eid;
	
	@Basic // just a plane old column
	@Column(name = "eName")
	private String eName;
	@Column(name = "salary") // @column is unnecessary because the name of the variable is the same as the name in the database 
	private double salary;
	@Column(name = "deg")
	private String deg;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String eName, double salary, String deg) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
		this.deg = deg;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", salary=" + salary + ", deg=" + deg + "]";
	}
	
}
