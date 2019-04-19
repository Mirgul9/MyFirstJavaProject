package team;

import java.util.Scanner;

public class Team3 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number:");
		
        int number = input.nextInt();
        
        int sqnumber =0;
        
		for(int i = 1; i <number; i++) {
			
			if(i %2 ==0 && i%3 ==0) {
				sqnumber= i * i;
				System.out.print(sqnumber);
				System.out.print(" ");
				
			}
			
			  
			
			
		}
		
	}

}
