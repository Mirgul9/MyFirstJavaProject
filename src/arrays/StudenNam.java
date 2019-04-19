package arrays;

public class StudenNam {
	public static void main(String[] args) {
		String [] students = {"James","John","Adam","Jamie","Benzema"};
		int size = students.length;
		System.out.println(size);
		for(int i=0; i<size ; i ++) {
			String student= students[i];
			System.out.println(student.charAt(0));
			 //sys.out(student.charAt(0)
			if(student.endsWith("s")) {
				System.out.println(student);
				
			}
		}
		
	
	

}

}
