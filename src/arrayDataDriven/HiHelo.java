package arrayDataDriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HiHelo {
	public static void main(String[] args) throws FileNotFoundException {
	//String s= "Hello people out there";
		String s= "Hellopeople";
		String words[]=s.split("p");
	//String words [] =s.split(" ");
	String[] words2 = {"Hello","people","out","there"};
	System.out.println(Arrays.toString(words2));
	System.out.println(Arrays.toString(words));
}
}