package stringmanipulation;

public class CheckAccount {
	public static void main(String[] args) {
		String s = "Account Number: 453453";
		//check if " number is starting with upper case or lower case
		// print "start with upper case " if " Number"
		// print " start with lower case ' if " Number'
		int nIndex = s.indexOf(" ") +1;
		
		if(s.charAt(nIndex) == 'n') {
			System.out.println("Starts with lower case");
		}else {
			System.out.println("Starts with upper case");
		}
	}

}
