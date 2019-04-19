package arrayclass;

import java.util.Arrays;

public class Search {
	public static void main(String[] args) {
		int [] target = {45,23,6,-3,66};
		for(int i=0; i<target.length;i++) {
			if(target[i]==23) {
				System.out.println(i);
				break;
			}
			
		}
		Arrays.sort(target);
		System.out.println(Arrays.toString(target));
        int result =Arrays.binarySearch(target,77);
        System.out.println(result);
        ///-1(1)-1=>-2
	}

}
