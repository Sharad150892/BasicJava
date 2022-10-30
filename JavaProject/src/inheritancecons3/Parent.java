package inheritancecons3;

public class Parent {
	
	public Parent() {
		
		System.out.println("Parent Constructor 1");
		for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(" *");
			}
			System.out.println("  ");
		}
		System.out.println("<---------->");
	}
	
	public Parent(int a) {
		this();
			
		System.out.println("Parent Constructor 2");
			for (int i=1; i<=5; i++) {
				for (int j=5; j>=i; j--) {
					System.out.print("  ");
				}
				for (int k=1; k<=(i*2)-1; k++) {
					System.out.print(" *");
				}
				System.out.println("  ");
			}
			System.out.println("<---------->");
	}
	
}
