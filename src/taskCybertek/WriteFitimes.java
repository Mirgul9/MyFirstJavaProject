package taskCybertek;

import java.util.Scanner;

public class WriteFitimes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 int number1;
		 int number2;
		 int number3;
		 
		 System.out.println("Please enter 3 integers:");
		 
		 number1 = input.nextInt();
		 number2 = input.nextInt();
		 number3 = input.nextInt();
		 
	     if(number1 == number2  &&  number1==  number3) {
	    	  System.out.println( "maximum number of " + number1 + ", " + number2 + ",and " + number3 +  " are equal " );
	     }else if(number1 > number2 && number1 > number3) {
	    	 System.out.println( "maximum number of " + number1 + ", " + number2 + ",and " + number3 +  " is: " + number1 );
	     }
	     else if(number2 > number1 && number2 > number3) {
	    		System.out.println( "maximum number of " + number1 + ", " + number2 + ",and " + number3 +  " is: " + number2);
		     }
	     else if(number3 > number2 && number3 > number1) {	
	    	
	     System.out.println( "maximum number of " + number1 + ", " + number2 + ",and " + number3 +  " is: " + number3);
    }}
	}	 
	
