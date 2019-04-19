package arrayclass;

import java.util.Arrays;



public class Sorting {
	public static void main(String[] args) {
		String[] cars= {"bmw","amg","mersedes","toyota","zenda","lexus"};
		System.out.println(Arrays.toString(cars));
		Arrays.parallelSort(cars);
		System.out.println(Arrays.toString(cars));
		 ////
		int ages[]= {34,23,6,24,78,89,55};
		System.out.println(Arrays.toString(ages));
		Arrays.parallelSort(ages);
		System.out.println(Arrays.toString(ages));
		
		
	}

}
