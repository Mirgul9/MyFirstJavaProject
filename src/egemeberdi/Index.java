package egemeberdi;

import java.util.Scanner;

public class Index {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your message");
	String message = input.nextLine().toLowerCase().trim();
	int first = message.indexOf("heck");
	int second = message.indexOf("silly");
	int third = message.indexOf("idiot");
	System.out.println( + ", " +  silly + ", " + idiot);
}
}
