package Loop;

import java.util.Scanner;

public class RacistPerson {
	// write a program named RacistPerson. Ask the name 
	// from user and print " GOood job , % name " except for the James.
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		for(; ;) {
		System.out.println("Please enter your name");
		String name = input.nextLine();
		if ( name.equalsIgnoreCase("James")) {
			continue;
			
	}System.out.println("Good job," + name);


}
}
}
