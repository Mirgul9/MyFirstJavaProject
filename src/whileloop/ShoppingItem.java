package whileloop;

import java.util.Scanner;

public class ShoppingItem {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("How many item you are purchasing");
	int items = input.nextInt();
	
	//input.hasNextLine();
	
	
	double totalPrice=0;
	String itemNames = "";

	
	for(int i=1; i<=items;i++) {        // i - 1 , 2 < 4 Note: i starts from 1 , thats why we have to write <= items
		
       System.out.println("What is item" +i+ "?"); //i - 1,2
       input.nextLine();                            // this line of code reads the empty space

        String item= input.nextLine();              //item <-- user is imputting a string "hat","gloves"
	    System.out.println("How much is " + item + "?");
	    double price = input.nextDouble();		    // 10.5	, 55.3
		
		itemNames =itemNames+ ", "+item; // "" +", "+"hat" =", hat" + ", " + "gloves"=  ", hat, gloves" 
		 totalPrice =totalPrice+  price;  // 0 + 10.5       =             10.5 + 55.3=   65.8
		 
			
	}
	
	System.out.println("Your items: "+itemNames);
	System.out.println("Your total Price:" + totalPrice );
	
	
	
	
	}
	}




