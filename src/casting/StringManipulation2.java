package casting;

import java.util.Scanner;

public class StringManipulation2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message");
		String s =input.nextLine().trim();
		
		char grammer =s.charAt(0);
		
		int decimal = grammer;
		System.out.println(decimal);
		if (decimal >= 65 && decimal <= 90 && (s.endsWith(".") || s.endsWith("!"))){
			System.out.println("Valid message");
		}else {
			System.out.println("Invalid message");
		}
	}

}
