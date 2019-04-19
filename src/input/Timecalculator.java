package input;

import java.util.Scanner;

public class Timecalculator {
 public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Welcome to Time Calcutr!");
	System.out.println("Please enter seconds:");
	int seconds =input.nextInt();
	int minutes =seconds/60;
	int remainingSeconds=seconds%60;
	int hours=minutes/60;
	int remainingMinutes=minutes%60;
	System.out.println(seconds + "second converted into:");
	System.out.println(hours +"hours");
	System.out.println(remainingMinutes + "minutes");
	
	

	
}
}


