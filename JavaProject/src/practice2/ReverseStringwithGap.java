package practice2;

public class ReverseStringwithGap {

	public static void main(String[] args) {

		String a ="Automation Dev";
		String x = "";
		a = a.replaceAll("\\s","");

		for(int i = a.length()-1; i>=0 ; i--)
		{
			 x = x + a.charAt(i); 		

		} 
			System.out.println(x);

		}	
}
