package multidimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class Num {
	public static void main(String[] args) {
		int[][] na = Number(3,5);//3big boxs and/// each 5 elements
		System.out.println(Arrays.deepToString(na));
		print2D(na);
		
		
	}
    public static int [][] Number(int a, int b ){
    	Random input = new Random(100);
     int[][] newArray= new int[a][b];///this means assign == barabar korson
     for(int i=0; i<newArray.length;i++) {
    	 for(int  j=0; j<newArray[i].length;j++) {
    		newArray[i][j]=input.nextInt(100);/// input .next ==generate jokton bar kylat
    		
    	 }
     }return newArray;
    }
    public static void print2D(int[][] newArray) {
    	for(int i=0; i<newArray.length;i++) {
       	 for(int  j=0; j<newArray[i].length;j++) {
       		//System.out.print(newArray[i][j]+",");
       		
       	 }
       	 System.out.println();
       }
    }
    

}