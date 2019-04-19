package methodOverload;

public class Over {
	public static void main(String[] args) {
		draw();
		draw(45);
		draw("red");
		
	}
    public static void draw(String color) {
    	System.out.println("Drawing in" + color);
    }
    public static void draw(int size) {
    	System.out.println("Drawing with size of"  + size);
    }
}
