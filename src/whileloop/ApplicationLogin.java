package whileloop;

public class ApplicationLogin {
	public static void main(String[] args) {
	
		//int counter = 1;
		int counter = 15;
		/// print " its raining while counter is less than 15.
		// counter value increment by 1 for each iteration.
		
		//while( counter <16 ) {
			//System.out.println("It's raining -"+  counter);
			//counter++;
			///counter ++ ; => ITS MEAN INCREMENT
		//}
		do {
			System.out.println("It's raining -"+  counter);
			counter++;
		}while (counter <16);
	}

}
