package team;

import java.util.Scanner;

public class Team4 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Enter word:");
		String str2 = input.next();
		for(int i=0;i<str2.length();i++) {
			if(str2.length( )>3 && str2.length() < 100) {
			if(str2.charAt(i)>=48 && str2.charAt(i)<=57) {
				System.out.print(str2.charAt(i));
			}
			}
			else {
				System.out.println("Invalid number");
			}
		
}
}
}