package Split;


import java.util.Arrays;
import java.util.Scanner;


public class WordCounter {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String str= "Write a program that creates a group of ";
		String [] words= str.split(" ");
		int counter=0;
		for(String word:words) {
			counter++;
			if(word.equals("program")) {
				System.out.println(counter);
				
				
			}
			
		}
		System.out.println(counter);///answer 3
		//Write a program that print out the word by the length
		//shortest length words first then longer length words.
		
		System.out.println(Arrays.toString(words));
		for(int n=1 ; n<words.length;n++)
		for(int i=0; i<words.length;  i++) {
			if( words[i].length() ==n) {
			System.out.println( words[i] ) ;
			
				}
			}
			
			int longest = 0;
			for(String word:words) {
				if(word.length() > longest) {
				longest =word.length();
			
			//out a
			//a
			//of
			//that
			//Write
			//group
			//program
			//creates
/// write  a program that the maimum length wordf
		System.out.println(longest)	;
}
	}
	}
}