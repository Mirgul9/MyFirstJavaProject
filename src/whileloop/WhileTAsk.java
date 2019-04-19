package whileloop;

import java.util.Scanner;

public class WhileTAsk {
public static void main(String[] args) {
	///print "transaction amount is too high and break the loop 
	//if transaction amount is going to put balance to negative
     
	
	// ask item name from the user per each transsaction
	Scanner input = new Scanner(System.in);
	String itenName;
	int balance =1500;
	int amount ;
	
        while(0 < balance) {
	
		System.out.println("Please enter transaction amount:");
		amount = input.nextInt();
		input.nextLine();
		System.out.println("Enter item name");
		String itemName = input.nextLine();
		if(itemName.equalsIgnoreCase("ak -47")) {
			System.out.println("Illegal Item");
			break;
		}
		if(amount > balance) {
		System.out.println("Transaction amount too high");
		//break;
	   continue;
	   //try lower price
		
		
		}
		balance = balance - amount;
		System.out.println(itemName + "purchase successfully!");
	}
	if (balance == 0) {
		System.out.println("You are broke");
	}
    System.out.println("Your balance:" + balance);
}
}




