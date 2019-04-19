package foreachloop;

public class wordcounter {
	public static void main(String[] args) {
		String [] groceries= {"Bread","Cucumber","apples","orange","cookies","Cake"};
		int counter=0;
		for(String freshmarket:groceries) {
			if(freshmarket.charAt(0) >=65 && freshmarket.charAt(0) <=90) {
				counter++;
			}
	}
		
		System.out.println(counter);

}
}
