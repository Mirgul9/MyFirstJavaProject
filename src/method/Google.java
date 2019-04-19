package method;

import java.util.Scanner;

public class Google {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		String result ="About 8,770,000 results (0.51 seconds)";
		String count=resultCount(result);
		System.out.println(count);
		String c = resultCount("About 2,330,000,000 results (0.86 seconds)");
		System.out.println(c);
		System.out.println(resultTime(result));
	}
	public static String resultTime(String res) {
		String r =res.substring(res.indexOf("(")+1,res.length()-1);
		return r;
}
	
	public static String resultCount(String res) {
		String [] words=res.split(" ");
		String s =words[1];//this give us second 
		s=s.replace("," ,"");
		return s;
	}

}
