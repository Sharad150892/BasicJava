package pattern;

public class Pattern4 {
	
	public static void main(String[] args) {
		
		
		for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=i; j++) {		// print space in increasing order
				
				System.out.print(" ");
			}
			
			for (int k=5; k>=i; k--) {			// print star in decreasing order
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
