package pattern;

public class Pattern2 {
	
public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {    
			
			for (int j=5; j>=i; j--) {			//Print space in decreasing order
				System.out.print("  ");
			}
			
			for(int k=1; k<=i; k++) {			// Print star in increasing order
				System.out.print(" *");		
				
			}
			System.out.println(" ");
		}
	}

}
