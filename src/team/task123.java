package team;
import java.util.*;

public class task123 {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    
	    // TASK 1
	    
	    System.out.println("Enter word:");
	    String str = input.next().toLowerCase();
	    
	    // Your code here 
	   int[] count = new int[255];

	       int length = str.length();
	       String sbb = "";

	       for (int i = 0; i < length; i++) {
	           count[str.charAt(i)]++;
	       

	       char[] ch = new char[str.length()];
	       for (int i = 0; i < length; i++) {
	           ch[i] = str.charAt(i);
	           int find = 0;
	           for (int j = 0; j <= i; j++) {
	               if (str.charAt(i) == ch[j])
	                   find++;
	           }

	           if (find == 1) {
	              sbb+= str.charAt(i) + ":"  + count[str.charAt(i)]+" ";
	           }
	           
	       }
	       System.out.println(sbb.trim());
	   
	    //------------------------------------
	    
	    
	    
	    
	    
	    // TASK 2
	    // Your code here
	    //------------------------------------
	        int limit = 100;
			    int itemsLimit = 3;
			    do{
			      System.out.println("Enter cost of item:");
			      int costOfItem = input.nextInt();
			      if(costOfItem>limit){
			        System.out.println("You can't spend more than $100" );
			      }else{
			        limit -=costOfItem;
			        itemsLimit--;
			        
			        if(limit==0||itemsLimit==0){break;}
			        else{
			          System.out.println("You spent $" + (100-limit) + " so far");
			          System.out.println("You may buy up to " + itemsLimit + " items");}
			      }
			    }
			    while(limit>0 && itemsLimit>0);
			    System.out.println("You bought " + (3-itemsLimit) + " items, spent $" + (100-limit)+ " and done shopping.");
			    
	    
	    // TASK 3
	    // Your code here
	   
	    	 String unique = "";
			    int [] arr = {5,7,8,8,11,55,23,23,23,54,7,1,2,2};
			    for(int i = 0; i<arr.length; i++){
			      int temp = arr[i];
			      int counter = 0;
			      for(int j = 0; j <arr.length; j++ ){
			        
			        if(temp==arr[j]){
			        	counter++;
			          
			        }}
			        if(counter>1){
			          
			        }else {
			        	unique +=" "+temp;
			        }
			      }
			    
			    System.out.println(unique);
			    
			    
	    
	    //------------------------------------
	    
	    
	    
	  }
	}