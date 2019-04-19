package ifelsestatement;

import java.util.Scanner;

public class Findmax {
 public static void main(String[] args) {
	 Scanner input =new Scanner(System.in);
	 int number1, number2,number3;
	 System.out.println("Please enter 3 integer:");
	 number1 =input.nextInt();
	 number2 =input.nextInt();
	 number3 =input.nextInt();
	 
	  //4
	 if(number1 == number2 && number1 == number3) {
		 System.out.println("All 3 numbers are equal");
		 
	 }
   else if(number1 >= number2 && number1 >=number3) {
	System.out.println("Max number of " +number1 + ", " + number2 + ",  and " + number3 + "is " + number1);
   }
   else if(number2 >= number1 && number2 >= number3) {
	   System.out.println("Max number of " + number1 + ", " + number2 +" ,  and" + number3 + "is " + number2);
   }
   else {
	   System.out.println("Max number of " + number1 + ", " + number2 +" ,  and" + number3 + "is " + number2);
   }
}
}
