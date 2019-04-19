package stringmanipulation;

public class EndWithStart {
	public static void main(String[] args) {
		String weather = "Really good";
		boolean check = weather.startsWith("Really good");
		System.out.println(check);
		boolean check2 = weather.endsWith("Really good");
		System.out.println(check2);
		boolean b = weather.startsWith("ly", 4);
		System.out.println(b);
		/// "ly" --> string we wnat to check
		///4 -> index where we want to start looking
		
		String s = "Account number: 55572ACCD";
		boolean checkAccount = s.startsWith("2", 16);
		System.out.println(checkAccount);
		if (checkAccount) {
			System.out.println("cool");
		}else {
			System.out.println("Not cool");
		}
	}

}
