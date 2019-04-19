package ifelsestatement;

import java.util.Scanner;

public class Operarithmetic {
 public static void main(String[] args) {
	 Scanner input =new Scanner(System.in);
	double a,b,result;
	String operator;
	boolean invalidOperator = false;

	System.out.println("Please enter two double values:");
	
	a = input.nextDouble();
	b = input.nextDouble();
    operator= input.nextLine();

	System.out.println("Please choose operator below:\n+, -, /,*");
	
	switch(operator) {
	case "+":
	//System.out.println("Result of" + a + " + " + b + " is " + (a+b));
		result = a+b;
		break;
	case "-":
		//System.out.println("Result of" + a + "- " + b + " is" + (a-b));
		result = a-b;
		break;
	case "*":
	//	System.out.println("Result of" + a + " * "  + b + "is" + (a*b));
		result = a*b;
		break;
	case "/":
		//System.out.println("Result of" + a + " / "  + b + "is" + (a/b));
		result = a/b;
		break;
	case">-":
		//System.out.println("Result of" + a + " >- "  + b + "is" + (a>-b));
		
			System.out.println("Operator Invalid. Please try again!");
		invalidOperator =true;
			
	}
	if(!invalidOperator) {
		//!false -> true
		//!true --> false
		
		
	}
	
	
	System.out.println("Result of" + a + " " + operator + " " + b + "is " + (a+b)) ;
	
	
	
	 
	
	
	  
	  
}
}
