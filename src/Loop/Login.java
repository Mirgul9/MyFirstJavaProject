package Loop;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	Scanner  input = new Scanner(System.in);
	//System.out.println("Please enter your password");
	for(; ;) {
		System.out.println("Please enter your password");
	//String passWord ="secret478";
	 String passWord = input.nextLine();
	 
	if(passWord.equals("secret478")) {
		System.out.println("Welcome to your profile!");
		break;
}
}
}
}