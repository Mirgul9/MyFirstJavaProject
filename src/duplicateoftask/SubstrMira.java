package duplicateoftask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SubstrMira {
public static void main(String[] args) throws FileNotFoundException  {
	File file= new File("file1.txt");
	Scanner input =new Scanner(file);
	//String fullName=input.nextLine();
	//System.out.println(fullName);
	int counter = 0 ;
	while(input.hasNext()) {
		String name = input.nextLine();
		counter++;
		if(name.contentEquals("Ainura")) {
			//counter++;
			System.out.println("She exists. I found her"+name+" "+counter);
		}
		
	}
	
	
}
}