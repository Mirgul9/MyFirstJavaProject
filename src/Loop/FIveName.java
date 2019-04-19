package Loop;

import java.util.Scanner;

public class FIveName {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	
	
	
	//for(int i = 0; i < 5; i++) { eto bez nomera ,second one s nomerom
	for(int i = 1; i <5; i++) {
		System.out.println("Please enter your name" + i);
		String name = input.nextLine();
		System.out.println(name);
	}
}
}
