package duplicateoftask;
import java.util.Scanner;
public class MiddleSub {
	public static void main(String[] args) {
		
	
	//if less than 3 or bigger than 100 characters
	//print only invalid enter
	//convert str to all lower characters
	//if number of character is odd convert middle
	//char upper case								   22
	//If number of characters is even con. middle length - > 23
	//two character Upper-case ex: name
	
	Scanner scan = new Scanner(System.in);
//	Random rand = new Random();
//	int i = rand.nextInt(1000);
	
	//System.out.println(i);
	
	String str = scan.nextLine().toLowerCase();
	String middle = "" ; 
			//23-1
	
	
	
	if(str.length()>3 && str.length()<100) {
		if(str.length()%2==1) {
			middle =""+ str.charAt(str.length()/2);
			
			
			
		}
		
		
		
	}
}}
