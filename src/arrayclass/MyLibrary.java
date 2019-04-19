package arrayclass;

import java.util.Arrays;
import java.util.Scanner;

public class MyLibrary {
public static void main(String[] args) {
	//Task
	  // creat a class MyLibrary
	  // creat an array myBooks and store 5 books in it.
	 //  Ask from user to replace book in your list of books
	 //  if given book exists in the myBooks array replace
	 //  it with new book.

	  // Flow:
	  // Please enter the book to replace:
	  // >Unbeatable minds
	   //Please enter the new book;
	  // >Leader eat last


	 //  your program should replace "Undertable minds" with "Leaders eat last"if myBooks contains iy.


	 //  Print the books using toString
	Scanner input =new Scanner(System.in);
	String[] myBooks = {"Garry Porter","Alice","Gitler","Chyngyz Aytmatov","Seven sence"};
	System.out.println("Please enter the book to replace:");
	String oldBook=input.nextLine();
	System.out.println("Please enter the new book:");
	String newbook=input.nextLine();
	Arrays.parallelSort(myBooks);;
     System.out.println(Arrays.toString(myBooks));
     int result =Arrays.binarySearch(myBooks,oldBook);
     if(result>=0) {
    	 myBooks[result]=newbook;
	
	}
	System.out.println(Arrays.deepToString(myBooks));
	}
}
	
