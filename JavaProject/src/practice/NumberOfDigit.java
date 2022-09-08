package practice;

public class NumberOfDigit {
	
	public static void main(String[] args) {
		
		int count=0, num=23476678;
		
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println("Number of Digit: "+count);
	}

}
