package practice3;

public class ReverseString {
	
	public static void main(String[] args) {
		
		//Using String concat + operator
		
		String str = "Saras";
//		String rev = "";
		
		
		/*for(int i = str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}*/
		
		
		
		//Using Character array
		
		/*char a[] = str.toCharArray();
		
		for(int i=a.length-1; i>=0; i--) {
			
			rev = rev + a[i];
		} 
		System.out.println("Reverse String is "+rev);
		*/
		
		//Using Sting buffer class
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse String is "+sb.reverse());
			
	}

}
