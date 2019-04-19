package team;

import java.util.Scanner;

public class TeamProject4 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		String s;
		int i;
		int possitive=0;
		int negative=0;
		int zero=0;
		do {
			System.out.println("Please, enter number: ");
			i=input.nextInt();
			System.out.println("Do you want to continue? y/n");
			input.nextLine();
	         s=input.nextLine();
				if(i>0) {
					possitive++;
				}else if(i<0) {
					negative++;
				}else if(i==0) {
					zero++;
				}

			}while(s.equalsIgnoreCase("y"));
	if(s.equalsIgnoreCase("n")) {
		System.out.println("Possitive :" +possitive);
		System.out.println("Negative: "+negative);
		System.out.println("Zero: "+zero);	
		
	
		
		
			 
	}
	}
}

					
				
		
		
	





