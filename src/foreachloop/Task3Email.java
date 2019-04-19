package foreachloop;

public class Task3Email {
	public static void main(String[] args) {
		String[] emails= {"marikrus.mira@gamil.com","donatdonald.vladi@gmail.com","krish7@mail.ru","World.piece@gmail.com","Safi90@mail.ru"};
		
		for(String name: emails) {
		if(name.contains("@") && name.contains(".")) {
			System.out.println(name);
			
		}
			
		}
		
		
	}

}
