package multidimensionalArray;

public class MaxValue {
	public static void main(String[] args) {
		
		int[][] input= {{4,2,6,45,23,1,},{22,34,66},{1,2,3}};
		dimensional(input);
		
		
		
		
	}
	public static void dimensional (int[] []arr ) {
		int maxNumber=0;
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(maxNumber<arr[i][j]) {
					maxNumber=arr[i][j];
					
				}
				
			}
			
		}
		System.out.println(maxNumber);
	}
	

}
