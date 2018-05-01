package JD.mainEntry;

import java.sql.SQLException;
import java.util.Scanner;

import JD.DAO.UserDAO;
import JD.model.User;

public class MainPoint {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		UserDAO uDAO= new UserDAO();
		Scanner reader = new Scanner(System.in);
		User user = null;
		Integer isRegister = null;
		Integer choice =0;
		while(choice !=4) {
			displayMenu();
			choice = reader.nextInt();
			reader.nextLine();
			switch (choice) {
			case 1:
				System.out.println("What is your email?");
				user = new User();
				
				user.setUser_email(reader.nextLine());
				System.out.println("What is your username?");
				user.setUser_name(reader.nextLine());
				System.out.println("What is your password?");
				user.setUser_password(reader.nextLine());
				isRegister = uDAO.register(user);
				if(isRegister!=null ) {
					System.out.println("You have successfully registered");
				}
				else{
					System.out.println("Invalid inputs.");
				}
				break;
			case 2:
				System.out.println("What is your email?");
				String email = reader.nextLine();
				System.out.println("What is your password?");
				String password = reader.nextLine();
				user= uDAO.login(email, password);
				if(user!=null ) {
					System.out.println("You have Logged in");
				}
				else {
					System.out.println("Unable to log in");
				}
				break;
			
			case 3:
				if(user!=null) {
					System.out.println("What is your username that you want to update to?");
					user.setUser_name(reader.nextLine());
					System.out.println("What is your password that you want to update to?");
					user.setUser_password(reader.nextLine());
					uDAO.update(user);
					System.out.println("updated");
				}
				else {
					System.out.println("You must Login in or Register");
				}
				break;
			
			case 4:
				
				break;

				default :
					System.out.println("Invalid input\n Please enter a valid number from 1 to 4");
			}
		}
		reader.close();
		
	}
	public static void displayMenu() {
		System.out.printf("|%80s%80s|\n","Menu"," ");
		System.out.printf("|%40s%40s%40s%40s|\n", "1 Register", "2 Login","3 Update Info", "4 Quit");
		
		
	}

}
