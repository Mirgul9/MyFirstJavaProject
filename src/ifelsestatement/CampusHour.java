package ifelsestatement;

import java.util.Scanner;

public class CampusHour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the time");
		boolean campusOpen;
		int time;
		time = input.nextInt();
	
		
		
		if(time >= 0 &&  time < 23) {
	  if(time >= 8 && time < 24) {
		  campusOpen=true;
		}
		else {
			campusOpen =false;
			
		}
	  System.out.println("campus open:" +campusOpen);
		}
		else {
			System.out.println("invalid time.Try again");
}
}
	
}

