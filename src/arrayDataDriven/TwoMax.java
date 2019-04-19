package arrayDataDriven;

import java.util.Arrays;

public class TwoMax {
	public static void main(String[] args) {
		
		int[]numbers= {23,1,34,3,54,54,51};
		
			Arrays.sort(numbers);
			System.out.println(Arrays.toString(numbers));
			////this print for us sort 1,3,23,34 
			
			int last =numbers.length-1;
			System.out.println(numbers[last]);///print 54
			for(int i=last; i>=0;i--) {       /// print 51
				if(numbers[last]!=numbers[i]) {
					System.out.println(numbers[i]);
					break;
					
				}
			}
			
		}

	}


