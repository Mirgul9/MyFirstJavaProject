package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class City {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String [] cities=  {"Chicago","New York","Chicago","miami","Washington","Chicago"};
		boolean check=true;
		
				
			
				 int counter=0;
			      for(int j =0; j <cities.length; j++) {
			    	 if(cities[j].equals("Chicago")) {
		                System.out.println("Windy city" );
		            check=false; 
		                 break;
					
			    	 }
			    	 
			      }
	             if(check) {
	            	 System.out.println("Windy city not found");
	            	 
	            	  //int counter = 0;
	            	 for(int i=0;i<cities.length;i++)
	            	 if(cities[i].equals("Chicago")) {// eto vctoby nayti numof city
	            		counter++;
	            	 }
	            	 
	             }
	             if(counter > 0) {
                   System.out.println("Number of chicago:" + counter);
			}
		

			
			
		
}
}


