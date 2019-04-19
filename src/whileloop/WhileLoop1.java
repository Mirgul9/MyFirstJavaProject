package whileloop;

import java.util.Scanner;

public class WhileLoop1 {
	
	public static void main(String[] args) {
//		for(int i = 0; i<5;i++) {
//			
//		}
		int f = 0;
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		
		while(true) {
			System.out.println("Enter your password please");
			
			password = input.nextLine();
			if(password.equals("Ernest123")) {
				System.out.println("Good job, right password");
				break;
			
				
			}else {
				continue;
			}
			
		}
		
		
		
	}

}

//"Ernest123"
