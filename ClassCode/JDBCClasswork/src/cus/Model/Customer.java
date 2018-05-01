package cus.Model;

public class Customer {

	public Integer customer_ID;
	public String customer_email;
	public Integer getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(Integer customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String fName;
	public String lName;
}
