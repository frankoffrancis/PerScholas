package Test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import apollo.dao.ShoesDAO;
import apollo.model.Shoes;

public class ShoeDAOTest {

	private ShoesDAO shoesDAO = new ShoesDAO();
	private List<Shoes> listShoes = new ArrayList<Shoes> ();
	private Shoes shoe = new Shoes();
	
	private Shoes shoe2 = new Shoes();
	private Shoes shoe3 = new Shoes();
	private Shoes shoe4 = new Shoes();
	@Before
	public void testPrep() {
		shoe.setShoeID(1);
		shoe.setCategoryName("home");
		shoe.setGender("male");
		shoe.setPrice(185.65);
		shoe.setShoeName("nike");
		shoe.setShoeSize(5);
		
		shoe2.setShoeID(2);
		shoe2.setCategoryName("inside");
		shoe2.setGender("female");
		shoe2.setPrice(15.65);
		shoe2.setShoeName("betas");
		shoe2.setShoeSize(6);
		
		shoe3.setShoeID(3);
		shoe3.setCategoryName("jet");
		shoe3.setGender("male");
		shoe3.setPrice(151.65);
		shoe3.setShoeName("lake");
		shoe3.setShoeSize(14);
		
		shoe4.setShoeID(4);
		shoe4.setCategoryName("tom");
		shoe4.setGender("female");
		shoe4.setPrice(11.65);
		shoe4.setShoeName("elf");
		shoe4.setShoeSize(12);
		
		listShoes.add(shoe);
		listShoes.add(shoe2);
		listShoes.add(shoe3);
		listShoes.add(shoe4);
	}
	
	@Test
	public void getAllShoesByGenderTest() throws SQLException {
		
		
		
		listShoes = shoesDAO.getAllShoesByGender("male");
		for(Shoes s  : listShoes) {
		assetThat(s,!equalTo(null) );
	}
	}
	

		
	
	@Test
	public void getAllShoesTest() throws SQLException {
		ShoesDAO shoesDAO = new ShoesDAO();

		List<Shoes> listShoes = new ArrayList<Shoes> ();
		
		listShoes = shoesDAO.getAllShoes();
		for(Shoes s  : listShoes) {
		assertThat(s,!equalTo(null));
		}
	}
	

		
	
	@Test
	public void getALLShoeByPriceRangeTest() throws SQLException {
		 
		
		List<Shoes> allShoes = new ArrayList<Shoes> ();
		 allShoes = shoesDAO.getAllShoesByPriceRange(10);
		
		listShoes.add(shoes);
		for(Shoes s  : allShoes) {
			assertThat(s,!equalTo(null));
		}
		
		
	}
	@Test
	public void getALLShoeByID() throws SQLException {
		List<Shoes> allShoes = new ArrayList<Shoes> ();
		 allShoes = shoesDAO.getAllShoesByShoeID(1);
		
		listShoes.add(shoes);
		for(Shoes s  : allShoes) {
			assertThat(s,!equalTo(null));
		
	}
}

