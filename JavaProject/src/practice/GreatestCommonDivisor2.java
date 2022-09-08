package practice;

public class GreatestCommonDivisor2 {
	
	public static void main(String[] args) {
		
		int n1 =24, n2 =18;
		
		while (n1 !=n2) {
			
			if (n1>n2) {
				n1-=n2;
			}
			else {
				n2 -=n1;
			}
		}
		System.out.println("GCD is "+n1);
		
	}

}
