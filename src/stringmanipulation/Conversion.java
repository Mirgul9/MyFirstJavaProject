package stringmanipulation;

public class Conversion {
public static void main(String[] args) {
	String color = "5.5";
	double price = 44.99;
	boolean isSunny = true;
	String s = " ";
	String result = price + color +isSunny;
	String priceInString = price + "";
	System.out.println(priceInString);
	boolean check = priceInString.isEmpty();
	    // if put s.is Empty
	System.out.println(check);
}
}
