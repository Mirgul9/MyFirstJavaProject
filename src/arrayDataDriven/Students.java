package arrayDataDriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Students {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("test.txt");
		Scanner sc= new Scanner(file);
		String result="";
		while(sc.hasNextLine()) {
			String name =sc.nextLine().trim();
			if(name.isEmpty()) {
				continue;
			}
			result +=name+",";
		}
		System.out.println(result);
		String[] studentsList =result.split(" ,");
		System.out.println(Arrays.toString(studentsList));
		
		
		///randomly find 5 group
	}

}
