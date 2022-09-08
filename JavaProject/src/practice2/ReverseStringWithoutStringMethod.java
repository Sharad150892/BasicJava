package practice2;

public class ReverseStringWithoutStringMethod {
	
	public static void main(String[] args) {
		String st = "Automation Maven";
		st = st.replaceAll("\\s","");
		char[] c = st.toCharArray();
		for(int i = c.length-1; i>=0; i--)
		System.out.print(c[i]);		
	}

}
