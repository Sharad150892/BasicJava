package stringprogram;

public class StringMethodUse {
	//1
	public void M1() {
		String a = "Regression";
		char value = a.charAt(4);		//chatAt(index) Method
		System.out.println(value);
	}
	//2
	public void M2() {
		String a = "Retesting";
		String b = "Process";		
		String value = a.concat(b);		//concat(String s) Method
		System.out.println(value);
		
	}
	//3
	public static void M3() {
		String a = "TestNg";
		String b = "TestNg";
		String c = "testng";
		boolean value = a.equals(b);		//equals(object o) Method giving true
		System.out.println(value);
		boolean value1 = a.equals(c);		// equals(object o) Method giving false
		System.out.println(value1);
	}
	//4
	public void M4() {
		String a = "Selenium";
		String b = "selenium";
		boolean value = a.equalsIgnoreCase(b);	//equalsIgnoreCase(String anotherString) Method
		System.out.println(value);
	}
	//5
	public void M5(String a) {
		a = "Throwable Class";
		String value = a.substring(9);	// substring(int beginindex) Method
		System.out.println(value);
	}
	//6
	public void M6(String a) {
		a = "Polymorphism";
		String value = a.substring(4, 7); //substring(int beginindex, int endindex) Method
		System.out.println(value);
	}
	//7
	public int M7() {
		String a = "Cucumber";
		int value = a.length();		// length() Method return length of String
		System.out.println(value);
		return 1000;
	}
	//8
	public String M8(String a) {
		a = "BIEBSC";
		String value = a.replace('I','B');	// replace(char old, char new) Method used to replace char
		System.out.println(value);
		return "Hello";
	}
	//9
	public void M9() {
		String a = "RCCIISPG";
		String value = a.toLowerCase();		//toLowerCase() Method use to make in lowercase
		System.out.println(value);
	}
	//10
	public void M10() {
		String a = "association";
		String value = a.toUpperCase();		//toUpperCase() Method use to make in uppercase
		System.out.println(value);
	}
	//11
	public void M11() {
		String a = " Sharad ";
		System.out.println(a);			// Untrim
		String value = a.trim();		// trim() Method use to trim from both end
		System.out.println(value);		// trimmed
	}
	//12
	public void M12() {
		String a = "Overloading";
		int value = a.indexOf('l');		// indexOf(char ch) Method used to give index value
		System.out.println(value);
		
	}
		//13
	public void M13(boolean b) {
		String a = "Cyyypress";
		int value = a.lastIndexOf('y');		//lastindexOf(int ch) Method used to give last index value
		System.out.println(value);
	}
	//14
	public void M14() {
		String a = "aahffjfkkkfdjhfjfkfjfff";
		boolean value = a.contains("jfk");		//contains(String charSequence) Method use for sequence
		System.out.println(value);
	}
	//15
	public void M15() {
		String a = "Automation";
		System.out.println(a);
		char[] value = a.toCharArray();			// toCharArray() Method used to give in Array form
		for(int i = 0; i<value.length; i++)
			System.out.println(value[i]);
	}
	//16
	public void M16() {
		String a = "Java Eclipse";
		String[] value = a.split("\\s");		//split(String regex) Method use to split String
		for(int i = 0; i<value.length; i++)
		System.out.println(value[i]);
	}
	//17
	public void M17() {
		String a = "	";
		boolean value1 = a.isBlank();	// isBlank() Method use to return blank true otherwise false
		boolean value2 = a.isEmpty();	// isEmpty() method use to return empty true otherwise false
		System.out.println(value1);
		System.out.println(value2);
	}
	
	
	
	public static void main(String[] args) {
		StringMethodUse obj = new StringMethodUse();
		obj.M1();
		obj.M2();
		M3();
		obj.M4();
		obj.M5("Finally");
		obj.M6("Inheritance");
		obj.M7();
		obj.M8("Hello");
		obj.M9();
		obj.M10();
		obj.M11();
		obj.M12();
		obj.M13(false);
		obj.M14();
		obj.M15();
		obj.M16();
		obj.M17();
		
	
	}

}
 