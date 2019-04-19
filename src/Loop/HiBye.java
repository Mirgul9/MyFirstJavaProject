package Loop;

import java.util.Scanner;
/// Infinitely loop
public class HiBye {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		for( ; ;) { 
	
       String message = input.nextLine().toLowerCase();
        if(message.equals("hi")) {
        	// if u want to close end u need to put break \
        	//else if ( answer.equals("exit")
        	//break
       System.out.println("Hello");
        } else {
        	System.out.println("Good bye");
        }
		}



}
}