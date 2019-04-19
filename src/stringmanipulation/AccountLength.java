package stringmanipulation;

public class AccountLength {
public static void main(String[] args) {
	String s = "Account Number: 453453623";
	//write a code that validates account number length.
	// each account lenght must be 8
	// print "Valid account length" if valid
	// print " Invalid accoutn lenght" if invalid
	
	int firstIndex =s.indexOf(":") + 2;
	String accountNumber = s.substring(firstIndex);
	
	if(accountNumber.length() == 8) {
		System.out.println("Valid account number length");
	}
	else {
		System.out.println("Invalid account number length");
	}
	 }
}

