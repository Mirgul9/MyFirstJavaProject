package casting;

import java.util.Scanner;

public class Message {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullMessage ="Sender:<Mike Smith>. "
				+ "From Number:[202-123-3456]."
				+ " Message:{I love programing and problem solving";
		int senderStart = fullMessage.indexOf("<") + 1;
		int senderEnd = fullMessage.indexOf(">");
		String sender = fullMessage.substring(senderStart, senderEnd);
		System.out.println(sender);
		
        int phoneStart = fullMessage.indexOf("[]") + 1;
        int phoneEnd = fullMessage.indexOf("]");
        String phone = fullMessage.substring(phoneStart, phoneEnd);
        System.out.println(phone);
        
        
        int messageStart =fullMessage.indexOf("{") + 1;
        int messageEnd = fullMessage.indexOf("}");
        String message = fullMessage.substring(messageStart,messageEnd);
        System.out.println(message);
	}

}
