package ifelsestatement;

import java.util.Scanner;

public class FindMaxNumber {
	public static void main(String[] args) {
		///1 creat Scanner 
		Scanner input = new Scanner(System.in);
		// 2 read two integer and store them into variables nym1.num2
		
		int number1, number2;
		System.out.println("Please enter two integers:");
		number1 =input.nextInt();
		number2 = input.nextInt();
		
		System.out.println(number1);
		System.out.println(number2);
		
		///3 using statemnet we coompare number1 to number2
		if(number1 > number2) {
			System.out.println("Max Number:" + number1);
		}
		else {
			System.out.println("Max Number:" + number2);

		}
		
		
		}
		
		//out put
	/// answer Please enter two integers:
		//13
		//12
		//13
		//12
		//Max Number:13
		
	}


