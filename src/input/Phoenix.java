package input;

import java.util.Scanner;

public class Phoenix {
	public static void main(String[] args) {
		System.out.println("Welcome to Phoenix");
		int age;
		double gpa;
		String message;
		Scanner input = new Scanner (System.in);
		System.out.println("How old are you:");
		System.out.println();
		age =input.nextInt();
		System.out.println("Age;"+age);
		System.out.println("Please enter your gpa:");
		System.out.println();
		gpa =input.nextDouble();
		System.out.println("Double;"+ gpa);
		System.out.println();
		System.out.println("Please enter your message:");
		System.out.println();
		message =input.nextLine();
		System.out.println("Hello;"+ message);
		
	System.out.println("Enter width:");
		int width=input.nextInt();
		System.out.println("Enter lenght:");
		int lenght=input.nextInt();
		System.out.println("Area of Rectangle:" +width *lenght);
		//System.out.println();
	System.out.println("Perimeter of Rectangle:" +2 *(width + lenght));
	
		//
		
	

		
		
	}

}
