package stringmanipulation;

import java.util.Scanner;

public class IndexPractice {
	public static void main(String[] args) {
		String breed ="Huskeys";
		int i = breed.indexOf("ky");
		System.out.println(i);
		//Write a program that detects bad words
	//	heck,silly, idiot
		//ask from user to enter the message'
		// check if message contains above bad words
		// if message contains any of those print "message failed
		// otherwise print "Message sent
		// Note : YOU MUST USE INDEEX OF METHOD
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message");
		String message = input.nextLine().toLowerCase().trim();
        int first = message.indexOf("heck");
        int second = message.indexOf("silly");
        int third = message.indexOf("idiot");
		System.out.println(first + ", " + second + ", " + third);
		
		
		
	if(first == -1 && second == -1 && third == -1) {
		System.out.println("Message sent!");
	}
	else {	
		
		System.out.println("Message failed");
			
		}
		
	}

}
