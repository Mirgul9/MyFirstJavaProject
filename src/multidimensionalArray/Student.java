package multidimensionalArray;

import java.util.Arrays;

public class Student {
	public static void main(String[] args) {
		String [] [] groups = new String[3][];
		//task 
		// creat 3 String arrays -3 group;
		//1 st array size of 2, 2nd array size of 5,3 rd array size of 4
		// GIve names for all element
		String [] team3= {"Adam","James"};
		String[] team2= {"Mira","Sultan","Safia","Farida","Akhun"};
		String[] team1= {"Dinara","Janara","Suaraz","Dembele"};
		groups[0]=team1;
		groups[1]=team2;
		groups[2]=team3;
		//System.out.println(Arrays.toString(groups[0]));//its give us team1
		//System.out.println(groups[2][1]);
		//System.out.println(groups[1][3]);
		
		//System.out.println(groups[2][0]);
		//System.out.println(groups[0][2]);
		//System.out.println(groups[1][2]);
		///print all teams using Arrays toString method
		System.out.println(Arrays.toString(groups[0]));
		System.out.println(Arrays.toString(groups[1]));
		System.out.println(Arrays.toString(groups[2]));
		//print each teams members using Arrays toString and using loop.
		for(int i=0;i<groups.length;i++) {
			for(int j=0; j<groups[i].length;j++) {
			//System.out.println(Arrays.toString(groups[i]));// team1,team2,team3
			//System.out.println(groups[i].length);//its give us how many names inside
			System.out.print(groups[i][j]+ " ");//Dinara Janara Suaraz Dembele Mira Sultan Safia Farida Akhun Adam James
		}
	System.out.println();
		}
}
}