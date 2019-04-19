package multidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(groups()));
		
		
	}
   public static String [][] groups() {
	   Scanner input = new Scanner(System.in);
		System.out.println("Please enter nums of groups");
		int num= input.nextInt();
		input.nextLine();
		
		
	   String[] [] newArray= new String[num][];
	   for(int i=0; i<newArray.length;i++) {
		   System.out.println("Please enter number of studens for group:"+(i+1 ));
			int nom=input.nextInt();
			input.nextLine();
	   
	    	 String[] group = new String[nom];
	    	 for(int j=0;j<group.length;j++) {
	    		 System.out.println("enter name" + (j+1)+":");
	    		group[j]=input.nextLine();
	         
	    	 }
	    	newArray[i]=group;
	   }
	   
	   return newArray;
	   
   }
}
