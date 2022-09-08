package breakandcontinue;

public class Break {
	
	
	public static void main(String[] args) {
		
		for (int i=0; i<=11; i++) {
			
			if (i==7)
				break;
			System.out.println(i);
		}
		
		System.out.println("Out of the loop");
	}
}
