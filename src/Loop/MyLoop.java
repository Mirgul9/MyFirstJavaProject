package Loop;

import java.util.Scanner;

public class MyLoop {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter your name");
		String name =input.nextLine();
		for(int i = 0; i <15; i ++) {
			System.out.println("Welcome, " + name);
		}
	}

}
