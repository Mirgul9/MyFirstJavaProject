package duplicateoftask;

import java.util.Arrays;

public class Highest {
	public static void main(String[] args) {
		int [][] input= {{4,2,6,45,23,1},{22,34,66},{1,2,3}};
		MaxNum(input);
		
	}
    public static void MaxNum(int [] [] num) {
    	int Max=0;
    	int index=0;
    	for(int i=0; i<num.length;i++) {
    		int sum=0;
    		for(int j=0; j<num[i].length;j++) {
    			sum+=num[i][j];
    		}
    			if(Max<sum) {
    				sum=Max;
    				index=i;
    		
    			}
    		}
    		System.out.println(Arrays.toString(num[index ]));
    	}
    	
    }

