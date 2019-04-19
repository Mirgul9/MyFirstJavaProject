package TaskForLoop;

import java.util.Random;
import java.util.Scanner;

public class RanNumber {
public static void main(String[] args) {
	Random r = new Random();
	int target = r.nextInt(100);
	System.out.println(target);
	Scanner input = new Scanner(System.in);
	int counter =0;
	for(int i = 0; i <100; i ++) {
		counter ++;
		
		if(i ==target) {
			System.out.println("Number if found");
			System.out.println("Number of counter:" + counter);
			System.out.println("Target:" + target);
			break;
		}
		
		
	}
}
}
