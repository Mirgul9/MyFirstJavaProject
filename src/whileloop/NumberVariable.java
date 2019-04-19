package whileloop;

import java.util.Scanner;

public class NumberVariable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int startNumber= input.nextInt();
		System.out.println("Enter number");
		int endNumber = input.nextInt();
		for(int i = startNumber; i <endNumber; i ++) {
			System.out.println("Step" + i);
			
		}
		System.out.println("Enter number");
		int startNumber1 = input.nextInt();
		int endNumber1 = input.nextInt();
		for(int i = endNumber1; i < startNumber1; i ++) {
			System.out.println("Step" + i);
		}
			
		
	}

}
