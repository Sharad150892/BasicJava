package practice2;

public class FindFactorial {
	
	public static void main(String[] args) {
		
		int num = 6;
		int factorial = 1;
		
		for(int i=1; i<=num; i++) {
			factorial*=i;
		}
		System.out.println(factorial);
	}

}
