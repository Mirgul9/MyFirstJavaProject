package egemeberdi;

import java.util.Scanner;

public class FindItem3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	  int card =100;
	  int transaction =0;
	 
	  for(int i =0; i <4; i++) {
		  System.out.println("Enter cost of  your items:");
		  int price=input.nextInt();
		    
	   if(card <price) {
		   System.out.println("You can not buy more then 100$");
		   continue;
	   }
		   card = card - price;
		   transaction= transaction + price;
		  	  
	  if(card==0 || i==3) {
		   System.out.println("you bought" + i +"items, spent " + card +"and done shopping");
		  break;
	  }
	  System.out.println("you spent $" + transaction + "so far");
	   System.out.println("you may buy up to" +(3- i)+"items");
		
	  }
		
		
	}	
		
}	
		
		
		
		
		
		
		

		