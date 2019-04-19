package egemeberdi;

import java.util.Scanner;

public class NewTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 word");
		String word =input.nextLine();
		String word2 = input.nextLine();
		String word3 = input.nextLine();
		
		if(word.length() == word2.length() && word.length() == word3.length()) {
		System.out.println("All words are some length");
		}else if(word.length() == word2.length() 
				|| word.length() == word3.length()
				|| word2.length() == word3.length()) {
			System.out.println("Not same different length");
	     } else
	    	 System.out.println("ALL Different");

}
}
