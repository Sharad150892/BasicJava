package practice3;

public class CheckPrimeNumberOrNot {

	public static void main(String[] args) {

		int num = 23;
		int count = 0;
		
		if(num>1) {
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2)
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is not Prime Number");
		}
		else
			System.out.println(num+"Not Prime Number");
	}	

}
