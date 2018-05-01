package cus.mainEntry;

import java.sql.SQLException;

import cus.CustomerDAO.CustomerDAO;
import cus.Model.Customer;

public class MainPoint {

	public static void main(String [] args) throws SQLException {
		// TODO Auto-generated constructor stub
		CustomerDAO cus = new CustomerDAO();
		cus.getCustomerByID(1);
		Customer cus1 = new Customer();
		cus1.setCustomer_email("tom@gmail");
		cus1.setfName("ew");
		cus1.setlName("sgddf");
		cus.addCustomer(cus1);
	}
}
