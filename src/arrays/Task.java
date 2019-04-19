package arrays;

public class Task {
	public static void main(String[] args) {
		String [] one = {"a","e","t","y","w","p","3","x","s","q"};
		String [] two = {"q","e","r","h","e","l","p","3","c","12"};
		String str ="";
		for(int i =0; i<one.length;i++) {
			for(int j=0; j<two.length;j++) {
				if(one[j].equals(two[i])){
					if(!str.contains(one[j])) {
						str+=one[j] +" ";// "" +"e"+" "=="e "+"p"+" "=="e p q 3 ";
						
					}
					
				}
			}
		}
			System.out.println(str);
			String[] array=str.split(" ");
		

	}

}
