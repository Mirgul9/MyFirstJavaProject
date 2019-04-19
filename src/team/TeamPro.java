package team;

import java.util.Scanner;

public class TeamPro {
	public static void main(String[] args) {
		
	   Scanner input= new Scanner(System.in);
	   int card = 100;
	   int transaction=0;
	   int price =0;
	   for(int i =0; i<3; i++) {
		   System.out.println("Enter cost of item ");
		   price=input.nextInt();
		   if(card<price) {
			   System.out.println("You can not buy more then 100$");
			  i--;
			   continue;
		   }
		      card = card-price;
			  transaction=transaction +price;
		   
		   if(price<card) {
			   System.out.println("you spent $" +i + price + "so far");
			   System.out.println("you may buy up to " + transaction+ "items");
			   break;
		   }
	
	       if(card==0 || i==3) {
		   System.out.println("you bought" + (3-0) + "items" + "spent $" +price + "done shopping");
	   }
	}
	    
	   }
	}




