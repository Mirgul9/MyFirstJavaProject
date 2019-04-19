package method;

public class ReurnMethods {
	public static void main(String[] args) {
	String w ="at";
	System.out.println(removeCon(w));
		
		//write a meethod Part 2
		// Method shoul accept 2 Strings
	    // 1 -data . 2 - String we want to rmove (3 leters)
	    // Every singlr rules for previous version is same for this method too
		
	}
		public static String removeCon(String word) {
			word =word.toLowerCase().trim();
			if(word.contains(" ") || word.length()<3) {
				System.out.println("Invalid data");
				return "";
			}
			if(word.contains("con")) {
				String s =word.replace("con", "");
				return s;
				
			}else {
				return word;
			}
		}
	}


