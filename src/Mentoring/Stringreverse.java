package Mentoring;

import java.util.Scanner;

public class Stringreverse {
	public static void main(String[] args) {
		
		{
		        
		        Scanner sc=new Scanner(System.in);
		        String A=sc.next();
		        
		        
		        for(int i = 0; i < A.length()/2; i++ )
		{
		    char temp = A.charAt(i);
		   A= A.charAt(i)+ (A.length()-1-i) + ("");
		    temp=A.charAt(A.length()-1-i);
		}

		        System.out.println(A);

		        
		    }
		}




		




	}


