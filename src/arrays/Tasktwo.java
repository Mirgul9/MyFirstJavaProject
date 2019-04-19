package arrays;

import java.util.Arrays;

public class Tasktwo {
	public static void main(String[] args) {
		int[] nums= {0,3,5,17,0,-28,0,0,9,13,0,1,99};
		int[] newNums=new int [nums.length];
		for(int i=0, j=0; i<nums.length; i++) {
			if(nums[i]!=0) {
				newNums[j]=nums[i];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(newNums));
	}

}
