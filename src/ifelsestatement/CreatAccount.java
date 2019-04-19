package ifelsestatement;

import java.util.Scanner;

public class CreatAccount {
	public static void main(String[] args) {
		
		String username1 ="test";
		String username2 ="james";
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter  username to creat");
		String enteredUsername =input.nextLine();
		
		if(enteredUsername.equals("test") || enteredUsername.equals(username2)) {
			 System.out.println("username taken");
			 
		}
		else {
			System.out.println("username created!");
			
	}   

	}
}
    
 
