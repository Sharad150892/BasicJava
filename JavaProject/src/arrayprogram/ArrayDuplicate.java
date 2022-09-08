package arrayprogram;

public class ArrayDuplicate {
	
	public static void main(String[] args) {
		
		int[] a = {12,45,4,55,45,32,66,78,66,12,1};
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if (a[i]==a[j])
					System.out.print(a[j]+", ");
			}
		}
	}
}