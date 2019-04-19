package duplicateoftask;

import java.util.Arrays;
import java.util.Random;

class Ran {
	public static void main(String[] args) {
	int [][] na= num(3,5);
	System.out.println(Arrays.deepToString(na));
	
	   
	   
}
	public static int [][] num(int a,int b){
		Random input=new Random(100);
		int [][] newNum=new int[a][b];
		for(int i=0;i<newNum.length;i++) {
			for(int j=0; j<newNum[i].length;j++) {
				newNum[i][j]=input.nextInt(100);
			}
		}return newNum;
	}

}
