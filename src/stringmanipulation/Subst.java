package stringmanipulation;

import java.util.Scanner;

public class Subst {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
//		int middle = str.length()/2; // 1
//		
//		if(str.length()%2==1 && (str.length() >= 5)) {
//			
//			str = str.substring(middle-1, middle+2);//  "fif" str.length() =>>>7::::  0,1,2,3,4,5,6 ::: 7/2=3
//		System.out.println(str);
//		
//		}
		//String str = "";
//		
		str = "abcdefg";
		
		
		str = str.substring(1, str.length()-1);
		
		System.out.println(str);
		
		
		
		
	}

}
