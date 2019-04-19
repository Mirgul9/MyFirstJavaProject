package Loop;

import java.util.Scanner;

public class Reverses {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word");
		String word =input.nextLine();
		int lastIndex= word.length() - 1;
	    for(int i = lastIndex; i >= 0; i--) {
			 // if u put i >0 togda viydet james --> sema
	    	
		          System.out.println(word.charAt(i));
		                    // println -->togda separate line
		                   //print --> togda one line
		          
		 }
	}

}
