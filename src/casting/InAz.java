package casting;

import java.util.Scanner;

public class InAz {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your word");
	String str = input.nextLine();
	 boolean isOdd =str.length()%2 ==0;
	 System.out.println("isOdd" + isOdd);
	 
}

}
