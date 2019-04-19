package whileloop;

import java.util.Scanner;

public class Pencil {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word:");
	    String word =input.nextLine();
		 
	    for (int i = 0; i < word.length(); i ++ ) {
			 
			 System.out.println(word.charAt(i));
		
			
		}

	
			
		
	    
	}

}
