package multidimensionalArray;

import java.util.Arrays;

public class Highest {
	public static void main(String[] args) {
		
		int [][] nums= {{23,34,45,56,67},{11,22,33,44,55}, {123,234,234,125,345},{3,2,1,4,6}};
		  //    i 0-->> sum 200    index=0
	
		 //nums;// 4 arrays
		 //nums[0] 5 element
		bigNumber(nums);
    
	}
	public static void bigNumber(int[][] arr) {
		int highest=0;
		int index=0;
		for(int i =0; i<arr.length;i++) {////  i==index of inner arrays
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {// j== index of inner arrays elements
			sum+=arr[i][j];
			
			
			}
			
			if(sum>highest) {
				highest = sum;
				index = i;/// for what ===
			}
		}
    
   
		System.out.println(Arrays.toString(arr[index]));
		
}
}