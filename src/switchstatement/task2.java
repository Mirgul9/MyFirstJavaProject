package switchstatement;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int price=0;
	    int quarter=0;
	    int dime = 0;
	    int nickle=0;
	  
	    System.out.println("Enter price in cents:");
	    price = input.nextInt();
	    
	
	    quarter =(100 - price) / 25;
	    dime = (100 - price) % 25 /10;
	    nickle = (100 - price) % 25/10/5;
	    
	}

}
