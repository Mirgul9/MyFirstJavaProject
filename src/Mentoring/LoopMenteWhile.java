package Mentoring;

public class LoopMenteWhile {
	public static void main(String[] args) {
		String name ="America";
		int i =0;
		int result = 0;
		while ( i < name.length()) {
			String character = String.valueOf(name.charAt(i));
			if(character.equalsIgnoreCase("a"))
				result++;
			i++;
			System.out.println(result);
		}
	}

}
