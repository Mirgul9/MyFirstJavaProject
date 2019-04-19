package duplicateoftask;

import java.util.Scanner;

public class FirstHalfOfString {
	public static void main(String[] args) {
		//privet
		Scanner input= new Scanner(System.in);
		String str = input.nextLine();// "
		String firstHalf = str.substring(0 , str.length()/2);//pri
		String secondHalf = str.substring(str.length()/2);//vet
		
	    System.out.println(firstHalf);
		System.out.println(secondHalf);
		//Kandaysingar --  
		
		System.out.println(str.substring(0,2) + str.substring((str.length()-2) ));//pr=== et
		System.out.println(str.substring( str.length()-2-3  , str.length()-1 ));// for the beginning of the string you can use hard coding.
		System.out.println(str.substring(0,1));									// Because String any length will always start from 0 and constant
			System.out.println(str.substring(str.length() -2));								// End of String will vary according to length. And is not constant
		
	}

}
