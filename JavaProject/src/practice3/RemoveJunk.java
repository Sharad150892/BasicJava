package practice3;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		String s = "sasjsjj2q8w2djkj##@^@*WIW@WH88ijjjsoHSdkdsk5845dsd5fhhhasssh267623&^&&&27^&82u2uhjsdG55^*I*D*SS$@Y&J";
		
//		s= s.replaceAll("[^a-zA-Z0-9]",""); // remove only special character
		
//		s= s.replaceAll("[a-zA-Z0-9]",""); // keep only special character
		
//		s= s.replaceAll("[A-Z]",""); // remove only uppercase character
		
		s= s.replaceAll("[^a-zA-Z0-9]","");  //print only number
		s= s.replaceAll("[a-zA-Z]","");
		
		System.out.println(s);
		
	}

}
