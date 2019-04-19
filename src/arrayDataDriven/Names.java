package arrayDataDriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Names {
	public static void main(String[] args) throws FileNotFoundException {
		//step1: dowload teh test .txt to your computer
		//step2; copy and paste it to your project
		//step3; cresat a class Names and paste the code snippet there
		// 1 if print the name that has the length of 5
		//2 if print all the names but empty lines
		
		File file = new File("test.txt");///we are try to read this code here
				Scanner sc=new Scanner(file);        
				while(sc.hasNextLine()){  
					String name = sc.nextLine().trim();
				//	if(name.length()==5){///length print delaet
					//System.out.println(name);///put sys out
					
				//}
					if(name.isEmpty()) {///uberaet empty space line
						continue;
					}
					System.out.println(name);
	}
	

}
}
