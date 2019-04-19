package stringmanipulation;

import java.util.Scanner;
// write a program that asks message from user
//replace all 'u' and 'U' with empty string
public class NoU {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter you message");
	String message = input.nextLine();
	message = message.replace("u","");
	message = message.replace("U", "");
	System.out.println(message);
}
}
