package presentation;

import java.util.Random;
import java.util.Scanner;

public class IFRan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int randomValue = random.nextInt(10);


		boolean found = false;
   
		System.out.println("Please guess the number between 0 and 10");

		 
			int usernumber = input.nextInt();
			if (usernumber == randomValue) {
				System.out.println("Congratulation! You got it!");
				found = true;
			} else if (usernumber < randomValue) {
				System.out.println(" You guess is low " + randomValue);

			} else if (usernumber > randomValue) {
				System.out.println(" You guess is too high");
			}
			System.out.println("Secret number was:" + randomValue);
             System.out.println("Found" + found);
		}
		
}