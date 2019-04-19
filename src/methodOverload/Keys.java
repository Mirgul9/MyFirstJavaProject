package methodOverload;

public class Keys {
	public static void main(String[] args) {
		//calculate((short)45);
		float b = 45;
		calculate(b);
		
	}
     public static void calculate(long s) {
    	 System.out.println("Long is calculating " + s);
     }
     public static void calculate(float i) {// int
    	 System.out.println("Int is calculating " +  i);
     }
}
