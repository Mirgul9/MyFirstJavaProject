package nestedlabelLoop;

import java.util.Scanner;

public class Task1Phonenum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean valid = true;
		System.out.println("Please enter your phone number");
		String phone=input.nextLine();
	
		
		if(!(phone.length()== 10 || phone.length()==12)) {
			System.out.println("Invalid length");
	
			
			}
		else if(phone.length()==12) {
			if(!(phone.charAt(0) == '(' && phone.charAt(4) ==')')) {
				System.out.println("Invalid phone number");
				
			}
		}
		phone = phone.replace("(","");
		phone =phone.replace(")", "");
		if(phone.length()==10) {
			for(int i =0; i <phone.length(); i++) {
			char c = phone.charAt(i);
			int ii = c;
			if(ii<48 || ii>57) {
				valid = false;
				System.out.println("Must be number between 0-9");
				break;
			}
		}
		System.out.println("Valid phone number");
	
}
	}
}
