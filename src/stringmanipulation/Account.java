package stringmanipulation;

import java.util.Scanner;

public class Account {
	public static void main(String[] args)  {
		String s = "Account number: 255572ACCD";
		//21
		//23
		int i = s.indexOf(":")+2;
		//int indexOfFirstDigit = s.indexOf(":")  +2;
		//why we put 2 because first digit 2
		System.out.println(i);
		
		if(s.charAt(21) == '2') {
			System.out.println("Cool");
		}
		else {
			System.out.println("Not cool");
		}
	}

}
