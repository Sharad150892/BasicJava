package inheritancecons3;

public class Child extends Parent{
	
	public Child() {
		super(12);
		
		System.out.println("Child Constructor 1");
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=(i*2)-1; j++) {
				
				System.out.print(" *");
			}
			System.out.println("  ");
			
			for (int k=5; k>=i; k--) {
				System.out.print("  ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
	 new Child();
	 System.out.println("<---------->");
	}

}
