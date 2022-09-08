package practice;

public class Fibonacci {
	
	/*In this example, instead of displaying the Fibonacci series of a certain number,
	we are displaying the series up to the given number (100).*/
	public static void main(String[] args) {
		
			int n=100, firstTerm=0, secondTerm=1;
			
			System.out.println("Fibonacci series upto "+n+" number");
				
				while (firstTerm<=n) {
					
					System.out.print(firstTerm+",");
					
					int nextTerm = firstTerm + secondTerm;
					firstTerm = secondTerm;
					secondTerm = nextTerm;
				}
			
	}

}
