package loop;

public class DoWhileLoop {
	
	public static void main(String[] args) {	
		int x = 0;
			
			do {
				
				if (x%2==0)
					System.out.print("["+x+"]"+" ");
					x++;			
			}
				while (x<=40);
				
		}

}
