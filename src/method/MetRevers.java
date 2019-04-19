package method;

import java.util.Scanner;

public class MetRevers {
	public static void main(String[] args) {
		reversString("James");
		
		
	}
	public static void reversString(String name) {
         int lastIndex=name.length()-1;
         String result="";
         
	  for(int i=lastIndex; i>=0;i--) {
	    	result +=name.charAt(i);
	    	
	    }
	System.out.println(result);
		
	}

}
