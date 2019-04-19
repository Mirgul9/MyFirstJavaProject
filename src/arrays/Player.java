package arrays;

import java.util.Scanner;

public class Player {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	String[]students= {"Adam","James", "John", "Adam", "Elize", "Jamie","Benzeme"};
	int size=students.length;
	System.out.println("Please enter your keyword");
	String keyword=input.nextLine();
	for(int i =0; i<size; i++) {
		String student=students[i];
		
		if(student.contains(keyword)) {
			System.out.println(student);
			
		}
		System.out.println();
	}
		
	}

}
