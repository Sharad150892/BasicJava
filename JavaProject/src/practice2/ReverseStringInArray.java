package practice2;

public class ReverseStringInArray {
	
	public static String RevString(String input) {
		String rev = "";
		for(int j = input.length()-1; j>=0; j--) {
			rev = rev + input.charAt(j);
		}
		return rev;
	}

	public static void main(String[] args) {
		
		String str = "Sharad Shyam Ram Thakur Banke Bihari";
		String ar[] = str.split(" ");
		for(int i = 0; i<=ar.length-1; i++) {
			String s1 = ar[i];
			ar[i] = RevString(s1);
		}
			for(int i = 0; i<ar.length; i++) {
				System.out.print(ar[i]+" ");
			}			
	}
}
