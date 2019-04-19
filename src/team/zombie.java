package team;
import java.util.*;

public class zombie {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line. 
		    
		    boolean livingPeople = false;
		    int f = 0 ;
		    do{livingPeople = false;
		     System.out.println("Day " + f + " " + Arrays.toString(inhabitants));
		     f++;
		      
		      for(int i = 0 ; i<inhabitants.length; i++){
		        inhabitants[i] = inhabitants[i]/2;
		        
		        
		      }
		      for(int i = 0 ; i<inhabitants.length ; i++ ){
		        if(inhabitants[i]>0){
		          livingPeople = true;
		          
		        }
		      } 
		     
		        
		      
		      
		    }while(livingPeople);
		    System.out.println("Day " + f +  " " + Arrays.toString(inhabitants));
		    System.out.println("---- EXTINCT ----");
	 }	  
	}