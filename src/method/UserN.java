package method;

import java.util.Random;

public class UserN {
	public static void main(String[] args) {
		creatUsername("Nancy", "Polci");
		
	}
	public static void creatUsername(String a, String b) {
		Random guy=new Random();
		int i = guy.nextInt(100);
		System.out.println(a + b + i);
		
		
		
		
	
	
	}

}
