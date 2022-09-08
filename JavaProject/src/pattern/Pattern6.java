package pattern;

public class Pattern6 {
	
	public static void main(String[] args) {
		for (int i=5; i>=1; i--) {
			
			for (int j=1; j<=(i*2)-1; j++) {			//print star in decreasing order
				
				System.out.print(" *");
			}
			
			System.out.println("  ");
			
			for (int k=5; k>=i; k--) { 		// print space in increasing order
				
				System.out.print("  ");
			}
			
		}
	}

}
