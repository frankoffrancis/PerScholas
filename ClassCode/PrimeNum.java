import java.util.Scanner;
public class PrimeNum {
	
	// FINDING THE PRIME number between 2 and itself 
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int num; 
		System.out.println("Enter a number");
		num = userInput.nextInt();
		
		for(int i =2; i <num; i++) {
			
			boolean isPrime = true;
			for(int j =2; j < i; j++) {
				if(i%j ==0) {
					isPrime =false; 
				}
					}
				if(isPrime) {
					System.out.println(i);
				
			}
		}
	}

}
