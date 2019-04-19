package method;

import java.util.Arrays;

public class MetodInte {
public static void main(String[] args) {
	int[] arr= {23,-1,3,-2};
	arraysReplace(arr,5);
	
	
}
	public static void arraysReplace(int[] numbers, int nums) {
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]<0) {
				numbers[i]=nums;
			}
		}
System.out.println(Arrays.toString(numbers));
}
}
