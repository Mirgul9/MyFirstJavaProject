package egemeberdi;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		//Task1
		//System.out.println("Please enter your name");
		//String name= input.nextLine();//mIRA
		//String firstLetter = ("" + name.charAt(0)).toUpperCase();//M
		//name = firstLetter +name.substring(1).toLowerCase();//ira
	   //System.out.println(name);
	     
        //Task2
		
        System.out.println("Enter fullName");
        String fullName = input.nextLine();
        String name;
        String lastName;
        
        int indSpace = fullName.indexOf(" ");//6
        name = fullName.substring(0,fullName.indexOf(" "));
        lastName =fullName.substring(fullName.indexOf(" ")).trim();
        System.out.println(lastName +" " +name);
}
}
