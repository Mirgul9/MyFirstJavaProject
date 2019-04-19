package method;

import java.util.Scanner;

public class Methods {
public static void main(String[] args) {
	printName("James");//its works if we put "James" without name it doesnt work
	printName("Adam");
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your name");
	String ss= input.nextLine();
		
	}
public static void printName(String name) { ///method signature
	System.out.println(name.charAt(0));
	
//public static void printName() {     
	//for(int i =0; i <50; i++) {
	//System.out.println("James"+i);
	}
}

