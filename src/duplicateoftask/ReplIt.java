package duplicateoftask;

import java.util.Scanner;

public class ReplIt {
	public static void main(String[] args) {
		System.out.println("Please enter two words:");
		Scanner input=new Scanner(System.in);
		String fullName =                "Ernest Koz";
		//System.out.println(fullName.substring(fullName.indexOf(6)).trim());
		String n1=input.nextLine();
		String n2=input.nextLine();
		if(n1.charAt(n1.length()-1) == n2.charAt(0)) {
			//System.out.println(n1+n2); // n1 - >> one eight << - n2
									   // (n1.substring(0,n1.length()-1) + n2)).trim();
									   // (n1 + n2.substring(1)).trim();
			System.out.println((n1.substring(0,n1.length()-1) + n2).trim());
		}else {
			System.out.println(n1+n2);
			
		}
		
		
//		str.substring(4)
//		str.substring(4,7)
//		str.substring(str.length()-3)
//		str.substring(str.length()/2 , str.length() - 3)
		
		
	}

}
