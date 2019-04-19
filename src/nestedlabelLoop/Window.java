package nestedlabelLoop;

public class Window {
	public static void main(String[] args) {
		// RUn 10 times in the inner loop and skip the inner loop when it hits 5 
		/// other than 5 print all the values of j
		// break the outer loop when j hits 7
	//out 0123456
    myOuterLoop:
	 for(int i =0; i <5; i++)
		 myInnerLoop:
        for(int j =0; j <10; j ++){
       
         if(j== 5){
         continue myInnerLoop;}
         if (j==7) {
        	  break myOuterLoop;
         }
        System.out.println(j);
         }

}
}