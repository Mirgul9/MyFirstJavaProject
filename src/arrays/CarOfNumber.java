package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CarOfNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of cars");
		int numOfcars =input.nextInt();
		input.nextLine();
		String [] myGarage= new String [numOfcars];
		//String [] myGarage = {"Aston Martin"};
		System.out.println(Arrays.toString(myGarage));/// null null
		
		//for(int i = 0; i<numOfcars; i++) {
			for(int i =0;i<numOfcars;i++) {
		                                        //myGarage[i] ="Aston Martin";/// aston martin
				
				System.out.println("Enter car" + (i+1));
				String s = input.nextLine();
				myGarage [i]=s;
			
		}
		System.out.println(Arrays.toString(myGarage));
		/// bmw,aston martin, mersedes,
		//myGarage[0] ="BMW";
		//myGarage[numOfcars-1]= "Mersedes";
		//System.out.println(Arrays.toString(myGarage));
		
		
		
	       int counter=0;
	      for(int j =0; j <myGarage.length; j++) {
	    	 if(myGarage[j].equalsIgnoreCase("BMW")  || myGarage[j].equalsIgnoreCase("Mercedes")) {
                System.out.println("You have German car" );
            counter++; 
                 break;
			
	    	 }
	    	 
	      }
	      if(counter==0) {
	    	  System.out.println("You dont have German car!");
	      }

	}
}
