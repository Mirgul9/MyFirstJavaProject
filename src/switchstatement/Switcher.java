package switchstatement;

public class Switcher {
	public static void main(String[] args) {
		String name ="John";
		
		
	        switch(name) {
	        case "James":
	        	System.out.println("James is the cool name");
	        	break;
	        case "Jamie":
	        	System.out.println("Jamie is okey name");
	        	break;/// exits the switch statement
	        case "John":
	        	System.out.println("John Wick??");
	        	break;
	         default:
	        	 System.out.println("Everithing else");
	        	 
	        	 //convert same logic to if else statements
	        	 
	        	 
	        	 System.out.println("Please enter your name:");
	        	 
	        	 if(name.equals("James")) {
	        		 System.out.println("James is a cool name");
	        	 }
	        	 
	        	 else if(name.equals("Jamie")) {
	        		 System.out.println("Jamie is okey name");
	        		 
	        		 
	        	 }
	        	 else if(name.equals("John")) {
	        		 System.out.println("John Wick??");
	        		 
	        	 }
	        	 else {
	        		 System.out.println("Everything else");
	        	 }
		}
		
	}

}
