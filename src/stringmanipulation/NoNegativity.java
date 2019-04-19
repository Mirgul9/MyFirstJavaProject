package stringmanipulation;

import java.util.Scanner;

public class NoNegativity {
	public static void main(String[] args) {
		// write a program that ask  message from the user
		// replace word "hate" with " love"
		//print new version of the message
		// i hate you! ----> I love you !
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message");
	    String message = input.nextLine().toLowerCase();
	    message = message.replace("hate", "love");
	    System.out.println(message);
	}

}
