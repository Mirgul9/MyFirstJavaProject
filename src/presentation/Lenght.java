package presentation;

import java.util.Random;
import java.util.Scanner;

public class Lenght {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Please enter your message");
		boolean sent =false;
		String message = input.nextLine();
		 
		if(message.length()> 15) {sent=true;
			
			
		}else {sent=false;
			}
		
			System.out.println("message:" +  message+"\nsent "+ sent);
		//task part II
			// DECLARE BOOLEAN FOR 'delivered' status 
			// generation random number 0-10
			///check generated number . if even then set ' delivered' to true 
			/// if number is odd set ' delivered' status to false
			
			
			boolean delivered = true;
			 int randomValue = random.nextInt(10);
			 //int remainder = randomValue%2;
			
			 
			 if(randomValue %2 == 0) {
				 delivered =true;
				
			 }
			 else { 
				 delivered =false;
			 }
		 
		 System.out.println("Message:" + message);
		 System.out.println("Sent:" + sent);
		 System.out.println("Delivered:" + delivered);
		
		
		 
		
	}

}
