package method;

public class MetOddNum {
	public static void main(String[] args) {
	
		printOddnum50();
		welcome("Mira");
		welcome("Adam");
		Odd(10);
		
		
		
	}
	public static void printOddnum50() {
	for(int i=0; i<50;i++) {
		if(i % 2==1) {
		System.out.print(i + " ");
		
	}
		
	
	}}
	
	public static void welcome(String s){
		System.out.println("welcome,  " + s + "!");
		s="Hello";
		System.out.print(s);
		
	}
  public static void Odd(int n) {
	  for(int i =0; i<10;i++) {
		  if(i%2==1) {
			  System.out.println(i + " ");
			  
		  }
	  }System.out.println();
  }
	  
	
	
}
      
