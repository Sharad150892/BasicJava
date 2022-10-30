package practice3;

public class SumOfArray {
	
	
	public static void main(String[] args) {
		
		int a[] = {12,44,655,32,56};
		int sum = 0;
		
	/*	for(int i =0; i<=a.length-1; i++) {
			sum = sum + a[i];
		}*/
		
		//Enhance for loop
		for(int value:a) {
			sum = sum + value;
		}
		
		
		System.out.println("Sum of Array "+sum);
		
	}

}
