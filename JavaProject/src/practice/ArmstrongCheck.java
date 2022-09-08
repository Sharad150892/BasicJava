package practice;

public class ArmstrongCheck {
	
	
	public static void main(String[] args) {
		int a = 54748;
		int rem, result = 0;
		int x=a, n=0;
		
		for (;x!=0; x/=10, n++);
			x=a;
		
		for (;x!=0; x/=10) {
			
			rem = x%10;
			result += Math.pow(rem,n);
			
		}
		if (result==a)
			System.out.println(a+" is an Armstrong number");
		else
			System.out.println(a+" is not an Armstrong Number");
	}
}
