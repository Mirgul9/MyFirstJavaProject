package Loop;

import java.util.Scanner;
///

public class InfinitLogin {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int attempts =0;
	for(; ;) {
		System.out.println("Please enter your password");
	   String password = input.nextLine();
	   attempts++;
	 if(password.equals("secret123")) {
		 System.out.println("Welcome to your Profile");
		 break;
	 }
	if(attempts == 3) {
		System.out.println("your account is locked.try after 5 hours");
		break;
	}
}
}
}