package method;

public class Phone {
public static void main(String[] args) {
  boolean b =isWeatherSunny("Monday");
  if(b) {
        System.out.println("Lets do picnic");
   }else{
	   System.out.println("Lets do code");
   }

}
//return type method
	// method retuns bolean type
	// method accepts String
public static boolean isWeatherSunny(String day) {//bul jerdegi day
	if(day.equals("Monday")) { //bul jaka da jazylat day dep
		return true;///terminate the method
		
	}
	System.out.println(day + " is not sunny"); 
		return false;
	}
}



