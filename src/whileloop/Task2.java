package whileloop;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word");
		String word = input.nextLine();
	    System.out.println("Enter character:");
			char c = input.nextLine().charAt(0);
			System.out.println(word);
			System.out.println(c);
			int counter =0;
			
			for(int i = 0; i <word.length(); i++) {
				if (c== word.charAt(i));
				counter ++;
			}
			System.out.println(counter);
		}
	}


