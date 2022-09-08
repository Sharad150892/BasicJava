package pattern;

public class Pattern5 {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			
			for(int j=5; j>=i; j--) { 	//print space in decreasing order
				System.out.print("  ");
			}
			
			for (int k=1; k<=(i*2)-1; k++) {		//print star increasing order
				
				System.out.print(" *");
			}
			
			System.out.println(" ");
		}
	}
}
