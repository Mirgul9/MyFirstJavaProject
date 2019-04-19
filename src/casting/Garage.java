package casting;

public class Garage {
	public static void main(String[] args) {
		String garage ="Toyota,Nissan,Honda,BMW,Mazerati,Ford";
		System.out.println(garage.toLowerCase());
		boolean check = garage.isEmpty();
		System.out.println(check);
	
		if(garage.isEmpty()) {
			System.out.println("No cars in garage");
		}else {
			if(garage.contains("toyota") || garage.contains("nissan")) {
         System.out.println ("there are Japanese cars");
			}else {
				System.out.println("No japanese cars");
			}if(garage.contains("bmw")) {
				System.out.println("There are German cars");
			}else {
				System.out.println("No German cars");
			}if(garage.contains("mazerati")) {
				System.out.println("There are Italian cars");
			}else {
				System.out.println("No Italian cars");
			}if(garage.contains("jaguar")) {
				System.out.println("There are British cars");
			}else {
				System.out.println("No British car");
			}
}
}
}