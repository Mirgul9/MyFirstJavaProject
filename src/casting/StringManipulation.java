package casting;

public class StringManipulation {
 public static void main(String[] args) {
   String s = "Published on Feb 12, 2018";
   int cap = s.indexOf(",");
   s = s.substring(cap+2);
   System.out.println(s);
   int year =Integer.valueOf(s);
   
   if(year <= 2019) {
	  System.out.println("Valid year"); 
   }else {
	   System.out.println("invalid year");
   }
}
}
