package ifelsestatement;

import java.util.Scanner;

public class Profile {
public static void main(String[] args) {
	String color =("yellow");///// for mira , count how many letter in this word= answer 6
	color.equals("red");
	int size =color.length();
	System.out.println(size);
	
	///task  write a code that aask from user to creat password 
	///password must be at least 5 charachterr and 
	 
	Scanner input =new Scanner(System.in);
	System.out.println("Please enter a password to creat:");
	String password =input.nextLine();

	int lengthOfPassword =password.length();
	
	if(lengthOfPassword >= 5 && lengthOfPassword <= 12) {
	 System.out.println(password +"created");
	}
	
	else {
		if (lengthOfPassword <5) {
			System.out.println("Password length is too short");
			
	
		}
		else { 
			System.out.println("Password length is too long");
			System.out.println("Try shorter password");
		}
	}
	
	
}

}