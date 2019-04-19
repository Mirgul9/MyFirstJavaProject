package presentation;

import java.util.Random;

public class IfElse {
 public static void main(String[] args) {
	
	 ///Scanner -. a class that comes from Java library.
	 /// Random --> a class that comes from java and help us to generate some number
	 
	 Random random = new Random();
	 int randomValue = random.nextInt(100); 
	 System.out.println(randomValue);
	 int remainder = randomValue % 2;
	 if(remainder == 0) {
		 System.out.println("Number is Even!");
		 
	 }
	 else { 
		 System.out.println("Number is Odd");
	 }
	 
	
	
	
}
 
 
 
 
}
