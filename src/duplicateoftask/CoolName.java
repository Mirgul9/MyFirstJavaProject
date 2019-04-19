package duplicateoftask;

import java.util.Scanner;

public class CoolName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name =input.nextLine();
		char first=name.charAt(0);
		int l=name.length();
		char last=name.charAt(l-1);
		 
		if(first=='a'&& last=='z') {
			System.out.println("Cool");
		}else
			System.out.println("Not Cool");
	}
}
