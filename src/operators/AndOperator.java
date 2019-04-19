package operators;

public class AndOperator {
	public static void main(String[] args) {
		int age = 17;
		String name = "James";
		System.out.println("Age:" + (age > 21));
		System.out.println("Name:" +(name == "James"));
		boolean result = (age >21) && (name == "James") || 5>4;
		System.out.println("Final result:" + result);
	} 

}
