package duplicateoftask;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter name");
		String s=input.nextLine();
		
		s=s.replace("u","");
		s=s.replace("U","");
		System.out.println(s);
}
}