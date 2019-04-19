package multidimensionalArray;

import java.util.Random;

public class Dimen {
	public static void main(String[] args) {
		//int [] [] arr =new int[4][5];
		//print out the maximum sum value that one inner array gives
		
		int [][] nums= {{23,34,45,56,67},{11,22,33,44,55}, {123,234,234,125,345},{3,2,1,4,6} };
		
		for(int []n:nums) {
			for(int i:n) {
				System.out.print(i+ " ");
			}
		}
			//System.out.println();
			int sum=0;
			int max=0;
			int counter=0;
			
			for(int []n:nums) {
				counter++;
				sum=0;
				for(int i:n) {
					sum +=i;
					
					
				}if(sum>max) {
					max=sum;
				}
				System.out.println(sum);
			}
		System.out.println(max);
			
			}
		
		}
	
		
	

