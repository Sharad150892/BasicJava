package exceptionhandling;

public class UserDefineException {
	
	
	public void M1(int age) {
		
		if (age<=18 ) 
				throw new IllegalArgumentException("Underage");
		else
			System.out.println("Allowed to Vote");
		
	}
	
	
	public static void main(String[] args) {
		UserDefineException obj = new UserDefineException();
		obj.M1(23);
		
	}

}
