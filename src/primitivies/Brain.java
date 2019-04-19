package primitivies;

import java.util.Scanner;

public class Brain{
	 
  public static void main (String [] args) {
	  Scanner input=new Scanner(System.in);
	  System.out.println("Welcome to Time Calculator!!!");
	  System.out.println("Please enter total seconds");
	  int seconds= input.nextInt();
	  int minutes=seconds/60;
	  int remainingSeconds=seconds%60;
	  System.out.println(seconds + "seconds converted into");
	  System.out.println(minutes + minutes);
	  System.out.println(remainingSeconds +minutes);
	  
	  
	 
			 
			 

	 
	 
	 
}
}
