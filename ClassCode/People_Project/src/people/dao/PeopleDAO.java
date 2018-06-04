package people.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import people.model.People;
import people.utils.OracleQueries;

public class PeopleDAO {
	
	public List<People> getAllPeople(){
		People people = new People();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		List<People> listOfPeople = new ArrayList<People>();
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETALLPEOPLE);
			result = stmt.executeQuery();
			while(result.next()) {
				people.setPeople_id(result.getInt(1));
				people.setFirstName(result.getString(2));
				people.setLastName(result.getString(3));
				people.setCompanyName(result.getString(4));
				people.setAddress(result.getString(5));
				people.setCity(result.getString(6));
				people.setCounty(result.getString(7));
				people.setPeopleState(result.getString(8));
				people.setZip(result.getFloat(9));
				people.setPhone(result.getString(10));
		     	people.setEmail(result.getString(11));
				
				listOfPeople.add(people);
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOfPeople;
	}
	public People getPeopleByID (int id) {
		
		People people = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.GETPEOPLEBYID);
			stmt.setInt(1, id);
			result = stmt.executeQuery();
			people = new People();
			if(result!=null && result.next()) {
				people.setPeople_id(result.getInt(1));
				people.setFirstName(result.getString(2));
				people.setLastName(result.getString(3));
				people.setCompanyName(result.getString(4));
				people.setAddress(result.getString(5));
				people.setCity(result.getString(6));
				people.setCounty(result.getString(7));
				people.setPeopleState(result.getString(8));
				people.setZip(result.getFloat(9));
				people.setPhone(result.getString(10));
				people.setEmail(result.getString(11));
			}
			else {
				System.out.println("Incorrect ID");
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return people;
	}

	public List<People> getPeopleBy(final String query, String valueWant){
		
		People people = new People();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		List<People> listOfPeople = new ArrayList<People>();
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(query);
			stmt.setString(1, valueWant);
			
			result = stmt.executeQuery();
			while(result.next()) {
				people.setPeople_id(result.getInt(1));
				people.setFirstName(result.getString(2));
				people.setLastName(result.getString(3));
				people.setCompanyName(result.getString(4));
				people.setAddress(result.getString(5));
				people.setCity(result.getString(6));
				people.setCounty(result.getString(7));
				people.setPeopleState(result.getString(8));
				people.setZip(result.getFloat(9));
				people.setPhone(result.getString(10));
		     	people.setEmail(result.getString(11));
				
				listOfPeople.add(people);
			}
					
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return listOfPeople;
	} 
	

	public void deltePeople(int id) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.DELTEPEOPLE);
			stmt.setInt(1, id);
			 stmt.executeQuery();
		
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// saving values 
	// needs a return boolean or Integer
	// The people class has all of the columns that we need
	public Integer savePeople(People people ) throws ClassNotFoundException, IOException, SQLException {
		// we don't know the id
		Integer people_id = null;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		String [] COL = {"people_id"};
		ResultSet result = null;
		conn = OracleConnection.getConnection();
		stmt = conn.prepareStatement(OracleQueries.SAVEPEOPLE,COL);
		// set all required fields to the query;
		stmt.setString(1, people.getFirstName());
		stmt.setString(2, people.getLastName());
		stmt.setString(3, people.getCompanyName());
		stmt.setString(4, people.getAddress());
		stmt.setString(5, people.getCity());
		stmt.setString(6, people.getCounty());
		stmt.setString(7, people.getPeopleState());
		stmt.setFloat(8, people.getZip());
		stmt.setString(9, people.getPhone());
		stmt.setString(10, people.getEmail());
		stmt.executeUpdate();
		result = stmt.getGeneratedKeys();
		
		if(result != null && result.next()) {
			people_id = result.getInt(1);
		}
		return people_id;
		
	}
	
	public void deletePeople(int id) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.DELTEPEOPLE);
			
			 stmt.executeUpdate();
		
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void updatePeople (People people ) throws ClassNotFoundException, IOException, SQLException {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		String [] COL = {"People_id"};
		
		conn = OracleConnection.getConnection();
		stmt = conn.prepareStatement(OracleQueries.UPDATEPEOPLE,COL);
		// set all required fields to the query;
		stmt.setString(1, people.getFirstName());
		stmt.setString(2, people.getLastName());
		stmt.setString(3, people.getCompanyName());
		stmt.setString(4, people.getAddress());
		stmt.setString(5, people.getCity());
		stmt.setString(6, people.getCounty());
		stmt.setString(7, people.getPeopleState());
		stmt.setFloat(8, people.getZip());
		stmt.setString(9, people.getPhone());
		stmt.setString(10, people.getEmail());
		stmt.executeUpdate();
		
		

	}
}
