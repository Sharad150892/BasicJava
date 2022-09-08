package practice2;

public class ReverseUsingStringMethod {
	
	public static void main(String[] args) {

		String a = "Automation";
		StringBuilder str = new StringBuilder();
		str.append(a);
		str = str.reverse();
		System.out.println(str);
		}
}
