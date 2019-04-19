package arrays;


import java.util.Arrays;
public class DataBase {
	import java.util.Random;
	    public static void main(String[] args) {
	  
	         int [] ages = new int [50];
	         ages [0]= 34;
	         ages [1]= 32;
	         ages [2]= 89;
	         Random r= new Random();
//	       int age = r.nextInt(100);
//	       ages [2]= age;
//	       System.out.println(Arrays.toString(ages));
	         for (int i = 0; i < ages.length; i++ ) {
	            ages [i] = r.nextInt(100); 
	         }
	         System.out.println(Arrays.toString(ages));
	    }
	}

}
