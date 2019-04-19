package input;

import java.util.Scanner;

public class Multiple {
 public static void main(String[] args) {
	 Scanner input= new Scanner(System.in);
	String str;
	boolean multipleWord;
	System.out.println("Please enter the string");
	str = input.nextLine();
	str = str.trim();

	//boolean check =str.contains("");
	/// Modify a program it check if user entered some data or string empty
	// if user entered empty string then print ' please enter data
	// if user entered valid data then check if multiple words or not
	if(str.isEmpty()) {
		System.out.println("Please enter data");
	}
	else if(str.contains(" ")) {
		multipleWord =true;
		
	}else {
		multipleWord = false;
		System.out.println("Multiple words:" + multipleWord);
		
	}
	
	
	
	}
}
		
