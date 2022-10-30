package practice3;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String str = "Java   Programming     Selenium  automation";
		str = str.replaceAll("\\s","");
		
		System.out.println(str);
		
		
	}

}
