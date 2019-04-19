
	package arrays;
	import java.util.Arrays;
	public class DoubleArrayReplace {
	    public static void main(String[] args) {
	        double [] price = {45.99, 23.5, 11.50, 33.33, 99.99};
	        System.out.println(Arrays.toString(price));
	        price[4] = 112.89;
	        System.out.println(Arrays.toString(price));
	        // length --> this returns an integer that is a size of Array.
	        System.out.println(price.length);
	        
	    //  int [] numbers = new int [3] {34,23,5}; // --> dont put a size [3]
	        int [] number = {34,23,5}; // --> right way to initialize
	        
	    }

}
