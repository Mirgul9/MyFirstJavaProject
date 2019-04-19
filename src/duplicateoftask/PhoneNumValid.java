package duplicateoftask;

import java.util.Scanner;

public class PhoneNumValid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the phone number");
		String phone=input.nextLine();
		boolean check = true;
		if(phone.length() ==10){
			for(int i=0; i<phone.length();i++) {
				if(phone.charAt(i)>48 && phone.charAt(i)<57) {
					
				}else {
					check = false;
					System.out.println("Has to be only numbers");
				}
			}
			
		}else if(phone.length()==12) {
			if(phone.charAt(0)=='(' && phone.charAt(4)==')') {
			 phone.replace( "(","");
			 phone.replace(")", "");
			}
			for(int i=0; i<phone.length();i++) {
				if(phone.charAt(i)>48 && phone.charAt(i)<57) {
					
				}else {
					check = false;
					System.out.println("Has to be only numbers");
				}
			}
			
		}
		
		
		else {
			check = false;
			System.out.println("Invalid length - must be either 12 or 10 characters");
		}
		
			System.out.println("phone number valid " + check);
		
		
	}

}
