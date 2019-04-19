package foreachloop;

import java.util.Arrays;

public class EvenCollector {
	public static void main(String[] args) {
		int[] nums= {1,2,-3,4,-34,55,78,90,33,10};
		int counter=0;
		for(int  i=0; i<nums.length;i++) {
		if(nums[i]%2==0) {
			counter++;
		}
		}
		int[] evennums=new int[counter];
		for(int i=0,j=0; i<nums.length;i++) {
			if(nums[i]%2==0) {
				evennums[j] =nums[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(evennums));
		
		
		
		
		
	}


}

