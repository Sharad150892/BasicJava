package practice3;

public class MaxAndMinInArray {

	public static void main(String[] args) {

		int a[] = {23,44,56,46,89,12};
		
		/*int max = a[0];
		
		
		for(int value:a) {
			if(value>max) {
				max=value;
			}
			
		}
		System.out.println(max); */
		
		int min = a[0];
		for(int value:a) {
			if(value<min) {
				min=value;
			}
		}
		System.out.println(min);
	}

}
