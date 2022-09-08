package pattern;

public class Pattern3 {
	
public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			
			for(int j=5; j>=i; j--) {		// print star in decreasing order
					System.out.print(" *");
			}
			
				for(int k=1; k<=i; k++) {			// print space increasing order
					System.out.print("  ");
				}
					System.out.println("  ");
		}
	}

}
