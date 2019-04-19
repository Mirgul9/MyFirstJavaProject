package Loop;

public class Continue {
	public static void main(String[] args) {
		for(int i =0 ; i < 20; i ++) {
			// if u put before (sys.out printl(i)
			if(i == 13) {
				continue;
			}
			System.out.println("Something else");
		}
	}

}
