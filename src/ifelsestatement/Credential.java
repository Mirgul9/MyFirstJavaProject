package ifelsestatement;

import java.util.Scanner;

public class Credential {
 public static void main(String[] args) {
	 String username = "test";
	 String password ="test123";
	 Scanner input =new Scanner(System.in);
	 System.out.println("Please enter username");
	 String enteredUsername = input.nextLine();
	 System.out.println("Please enter password:");
	 String enteredPassword =input.nextLine();
	 System.out.println();
	
	 if(enteredUsername.equals(username) && enteredPassword.equals(password)) {
		 System.out.println("Welocme, "+ enteredUsername + "!!!");
		 
	 
	 }
	 else if(enteredUsername.equals(username) && !enteredPassword.equals(password)); {
		 
		 System.out.println("Invalid password");
		 
		/// task from repl it
		 String lan1 =input.nextLine();
		 String lan2 =input.nextLine();
		 System.out.println("Please enter your message");
		 
		 
	 }
    
    
    
	
 }
}
