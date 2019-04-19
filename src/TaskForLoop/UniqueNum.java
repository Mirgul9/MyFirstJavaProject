package TaskForLoop;

import java.util.Random;

public class UniqueNum {
	public static void main(String[] args) {
		Random r = new Random();
		String result =""; 
		
				for(int i = 0; i <6; i ++) {
			int ii= r.nextInt(10);
			// while result conatins the ii keep generatinf new ii
			while(result.contains(ii +"")) {
				ii = r.nextInt(10);
				
			}
			result+=ii;
			
			
		}
		
		System.out.println(result);
		//ne doljno viyti same number digit 
		
	}

}
