package switchstatement;

import java.util.Scanner;

public class KnowledgeValidor {
public static void main(String[] args) {
	
	///write a program that asks Grade from user
	//User must enter on character they are 
	// A,B,C,D,F
	//switch based on the characters and print proper messages 
	//must use string
	//check  for teh lenght of the grade . if not one character give them proper 
	//message
	 
	
	 Scanner input =new Scanner(System.in);
	 System.out.println("Please enter your grade");
	 String grade =input.nextLine();
	 
	 grade =grade.toUpperCase();
	 
	 if(grade.length() >1) {
		 System.out.println("Invalid data.Please enter one character");
	 }
	 
	    switch(grade) {
	 case "A":
		 System.out.println("Good job");
		 break;
	 case "B":
		 System.out.println("Not bad");
	    break;
	 case "C":
		 System.out.println("Try harder");
		 break;
	 case "D":
		 System.out.println("Failed");
		 break;
	 case "F":
		 System.out.println("Bad");
			 break;
		default:
			System.out.println("Invalid Grade");
			
				 
	    }
	    
}

}
		 
	
		
		  
	     	 
	    	 
	    


