package egemeberdi;

public class Stringobject {
	public static void main(String[] args) {
		String name ="Mirgul";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		int i =name.length();
		System.out.println(name.length());
		char c =name.charAt(0);
		System.out.println(name.charAt(0));
		 if(name.charAt(0) == 'M') {
			 System.out.println("it true");
		 }else {
			 System.out.println("not true");
		 }
		 char secondc = name.charAt(1);
	}
	

}
