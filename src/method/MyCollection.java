package method;

public class MyCollection {
public static void main(String[] args) {
	int []nums= {23,53,2,-4,23,-45,-785,1}; // we have array,
	System.out.println("Hello");
	printNagativeNums(nums);
}
public static void printNagativeNums(int [] number) {
	
	for(int num:number) { /// for eachLOOP
		if(num<0) {
			System.out.println(num);
		}
	}
		
}
}
