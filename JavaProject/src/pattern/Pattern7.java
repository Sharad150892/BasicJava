package pattern;

public class Pattern7 {
	
	public static void M1() {
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
	
	public static void M2() {
		
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
	
		public static void main(String[] args) {
		
		M1();
		M2();
	}

}
