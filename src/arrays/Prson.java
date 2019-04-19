package arrays;

import java.util.Arrays;

public class Prson {
	public static void main(String[] args) {
		//int[] ages = new int[3];// its mean 3 ages 
		int [] ages = new int[5];
		ages[0]= 18;
		ages[1]=45;
		ages[2] =66;
		ages[4]=22;
		ages[3]=71;
		ages[2]=27;// this one we cant see
		System.out.println(Arrays.toString(ages));//[0,45,0,0,0]
		//System.out.println(ages.toString());
		//System.out.println(ages[1]);// excepted 0 if we put 2 again we get 0
		//task Store different integer values to each index and print them all
		
	///out come [18,45,66,71,22]
	       

}
}