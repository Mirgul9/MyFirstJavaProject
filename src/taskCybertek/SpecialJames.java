package taskCybertek;

import java.util.Scanner;

public class SpecialJames {
	public static void main(String[] args) {
		// write a programm that  asks the time name from the user
		// if they enter james then ask their last name 
		// if their name is not james then dont't ask the last name
		// note : use nested if statement.
		
		// give value "nobody" if the name is not james
		/// print fisrt name and last name in the end of the program
		
		Scanner input = new Scanner(System.in);
		String firstName = "James";
	    String lastName;
		System.out.println("what is your name");
        firstName =input.nextLine();
		
		if(firstName.equals("James")) {
			System.out.println("Please enter your lastname");
			lastName =input.nextLine();
			
		}
		else {
		lastName =("Nobody");
		
	}
		System.out.println("fisrtName:" + firstName);
		System.out.println("lastName:" + lastName);
}
}