package SecondJDBC;

import java.sql.SQLException;
import java.util.Scanner;
public class MainEntry {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		UserDAO user = new UserDAO();
		//user.getAllUsers();
/*		user.getUserByEmail("fsdr@gmail.com");
		System.out.println();*/
		
		Scanner userInput = new Scanner(System.in);
	
	int response;
	System.out.println("Please select a number option that you want to do? \n1.Resgister 2.Login 3.Update Info 4. Quit");
	response = userInput.nextInt();
	
	loop: while(response >=1  && response <=4) {
		switch(response) {
		case 1:
			String email,password,userName;
			System.out.println("Please enter the username you want to register with");
		userInput.nextLine();
			userName = userInput.nextLine();
			
			System.out.println("Please enter the password you want to register with");
			password = userInput.nextLine();
			System.out.println("Please enter the email that you you want to register with ");
			email = userInput.nextLine();
			user.register(userName, password, email);
			System.out.println("Thank you for registering ");
			response =4;
			break;
			
		case 2:
			String email1=" ",password1=" ",userName1=" ";
			System.out.println("What is your username");
			userInput.nextLine();
			userName = userInput.nextLine();
			System.out.println("What is your password");
			password = userInput.nextLine();
			user.login(userName1, password1);
			break;
		
		/*case 3: 
			String email2,  password2,  username2;
			
			System.out.println("What is your email address ");
			email2 = userInput.nextLine();
			user.upDate(email2);
			break;
	*/
		
		case 4:
			System.out.println("Exiting");
			break loop;
		}
	}
	

	}
}

