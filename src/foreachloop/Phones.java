package foreachloop;

public class Phones {
public static void main(String[] args) {
	String[]phones= {"Iphone","Samsung","LG","Google Pixel","Motorola"};
	String[]phone2= {"Iphone","Samsung","LG","Google Pixel","Motorola"};
     
	if(phones.length==phone2.length) {
	int count=0;
	for(int i=0; i<phones.length; i++) {
		if(phones[i].equals(phone2[i])) {  /// we can do String p=phones[i]
			count++;                             /// String p2=phone2[i]
			                                   //if(p.equals(p2){
			                                       //counter++;
			                                       
		}
	}
	if(count!=phones.length) {
		System.out.println("Two arrays are different ");
	}else {
		System.out.println("two arrays are same");
	}
		
	}else {
		System.out.println("the arrays length are different");
	}
}
}