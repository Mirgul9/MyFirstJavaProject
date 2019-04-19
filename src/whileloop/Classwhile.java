package whileloop;

public class Classwhile {
	public static void main(String[] args) {
		int counter = 0;
		while ( 5 > 4) {
			System.out.println("Hi there!-" + counter);
			counter ++;
			 if(counter == 4) {
				 break;
			 } 
			 else if(counter == 2) {
				 // in this case we read only 2
				 continue;
			 }
			// counter ++;/// only 2
		}
	}

}
