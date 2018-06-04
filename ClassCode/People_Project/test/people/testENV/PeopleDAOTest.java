package people.testENV;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import people.dao.PeopleDAO;
import people.model.People;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
public class PeopleDAOTest {

	PeopleDAO pDAO;
	Boolean isSave;
	Integer idToDelete;
	People people = new People() ;
	@Before
	public void testPrep() {
		pDAO = new PeopleDAO();
		isSave = false;
		
		people.setFirstName("Bairon");
		people.setLastName("Kick");
		people.setCompanyName("Platform");
		people.setAddress("784 Mahattan");
		people.setCity("New York");
		people.setCounty("New York");
		people.setPeopleState("NY");
		people.setZip(12345f);
		people.setPhone("789-875-7848");
     	people.setEmail("BHY@GMAIL.COM");
     	
     	
	}
	@Test
	public void savePeopleTest() throws ClassNotFoundException, IOException, SQLException {
		idToDelete = pDAO.savePeople(people);
		People actualPeople = pDAO.getPeopleByID(idToDelete);
		
		assertThat(people.getFirstName(), equalTo(actualPeople.getFirstName()));
		isSave = true;
	}
	@After
	public void cleanUp() {
		if(isSave) {
			pDAO.deletePeople(idToDelete);
		}
	}
	
	@Before
	public void testGetAllPrep() {
		
		people.setFirstName("nick");
		people.setLastName("Kick");
		people.setCompanyName("re");
		people.setAddress("7984 Mahattan");
		people.setCity("New York");
		people.setCounty("New York");
		people.setPeopleState("NY");
		people.setZip(12345f);
		people.setPhone("789-875-7848");
     	people.setEmail("BHY@GMAIL.COM");
     	
	}
	@Test
	public void getAllPeopleTest() {
		
		List<People> AcutalList = new ArrayList<People>();
		People peopleName = new People ();
	
		
	}
}
