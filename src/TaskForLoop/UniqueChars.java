package TaskForLoop;

import java.util.Scanner;

public class UniqueChars {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Please enter the String.");
	String n = input.nextLine().toLowerCase().trim();
	
	n = n.replace(" ", "");
	String result ="";
	//System.out.println(n);

	for (int i = 0; i < n.length(); i++) {
      char c =n.charAt(i);
      if(result.contains(c+"")) {
    	  continue;
      }
      
          result+=c;  
        }
    System.out.println("Result:" + result);
}
	
}

