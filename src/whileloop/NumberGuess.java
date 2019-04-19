package whileloop;

import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		int secretNum = 45;
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the number");
		int guess = input.nextInt();
		
		while(guess != secretNum) {
			//45!= 45 its false
			System.out.println("Wrong! Enter your guess?");
			guess = input.nextInt();
			
		}
		System.out.println("Congrats!");
	}

}
