package Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import apollo.dao.CustomerDAO;
import apollo.model.Customer;

public class CustomerDAOTest {
	
	private CustomerDAO customerDAO = new CustomerDAO();
	private Customer customer = new Customer();
	private Customer customer2 = new Customer();
	private Customer customer3= new Customer();
	private Customer customer4 = new Customer();
	@Before
	public void testPrep() {
		customer.setCustomerID(1);
		customer.setEmail("apple@gmail.com");
		customer.setPassword("12345");
		customer.setUserName("Apple");
		
		customer2.setCustomerID(2);
		customer2.setEmail("Baseball@gmail.com");
		customer2.setPassword("12345");
		customer2.setUserName("Base");
		
		customer3.setCustomerID(3);
		customer3.setEmail("Basket@gmail.com");
		customer3.setPassword("12345");
		customer3.setUserName("Basket");
		
		customer4.setCustomerID(4);
		customer4.setEmail("Hockey@gmail.com");
		customer4.setPassword("12345");
		customer4.setUserName("Hockey");
		
	}
	
	@Test
	public void gettingCustomerByIDTest() throws SQLException {
		assertThat(customer.getCustomerID(1), equalsTo(customer));
	}
/*	@Test
	public void registerCustomerTest() throws SQLException {
	
		boolean isLoggedIn= false;
		isLoggedIn =customerDAO.registerCustomer("kate", "kate12", "kate@gmail.com");
		
		assertThat(true, equalTo((isLoggedIn)));
	}*/
/*	@Test
	public void deleteCustomerTest() throws SQLException {
		
		CustomerDAO customerDAO = new CustomerDAO();
		
		boolean isdelted = false;
		isdelted =customerDAO.deleteCustomer(3);
		
		assertThat(true, equalTo(isdelted));
		
	}*/
	@Test
	public void loginCustomerTest() throws SQLException {
		CustomerDAO customerDAO = new CustomerDAO();
		Customer logCustomer = new Customer();
		logCustomer=customerDAO.login("Hockey@gmail.com", "12345");
		assertThat(logCustomer.getEmail() ,equalsTo(customer4.getEmail());
		assertThat(logCustomer.getPassword() ,equalsTo(customer4.getPassword());
		assertThat(logCustomer.getUserName() ,equalsTo(customer4.getUserName());
	}

	@Test
	public void validateCustomerEmailTest() throws SQLException{
		
		
		boolean isValid = false;
		isValid = customerDAO.validateUserEmail(customer3.getEmail(), "Basket@gmail.com");
		assertThat(true, equalTo(isValid));
		
	}
	
	@Test
	public void validateCustomerUserPass() throws SQLException{
		
		boolean isValid = false;
		isValid = customerDAO.validateUserPass(customer2.getPassword(), "12345");
		assertThat(true, equalTo(isValid));
		
	}
}
