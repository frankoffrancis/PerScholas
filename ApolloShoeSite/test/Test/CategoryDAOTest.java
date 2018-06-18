package Test;

import static org.junit.Assert.*;

import org.aspectj.lang.annotation.Before;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import apollo.dao.CategoryDAO;
import apollo.model.Category;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CategoryDAOTest {

	private CategoryDAO categoryDAO = new CategoryDAO();
	private Category category = new Category();
	private Category category2 = new Category();
	private List<Category>listOfCategory = new ArrayList<Category>();

	@Before
	public void testPrep() {
		category.setCategoryID(1);
		category.setCategoryName("Home");
		category2.setCategoryID(2);
		category2.setCategoryName("Eating");
		c
		listOfCategory.add(category);
		listOfCategory.add(category2);
	}
	@Test
	public void getAllCategoryTest() throws SQLException {
		
		
		assertThat(categoryDAO.getCategoryByID(1) equalsTo(listOfCategory));
		}
	}
	
	@Test
	public void getCategoryByID() throws SQLException {
		assertThat(categoryDAO.getCategoryByID(1),equalsTo("Home"));
		
	}
}
