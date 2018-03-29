import java.util.Scanner;
public class Averages {
	
	public static void main(String[]args) {
	
			Scanner userInput = new Scanner(System.in);
			int size ;
			System.out.println("What is the size of the array");
			size = userInput.nextInt();
			int [] avg = new int [size];
			int answer;
			int total = 0; 
			int totalAvg =0;
			for(int i =0; i<avg.length; i++) {
				System.out.println("enter a value in the "+i+ " position");
				answer=userInput.nextInt();
				avg[i]= answer;
				total=avg[i]+total;
				totalAvg = total/avg.length;
				
			}
			System.out.println("The avg is "+totalAvg);
			
		
		}
	

	}

