package exceptionhandling;

public class UserDefineExcep2 {
	
	public void M1(String name, int age) {
		System.out.println(name+" "+ age);
		try {
			if (age<=18)
				throw new IllegalArgumentException("Underage");
			else
				System.out.println("Allowed to Vote");
		}
		catch (IllegalArgumentException ref) {
			System.out.println(ref.getMessage());
		}
		finally {
			System.out.println("Finally Will Always Run \n");
		}
	}
	
	public static void main(String[] args) {
		UserDefineExcep2 obj = new UserDefineExcep2();
		obj.M1("Sharad", 21);
		obj.M1("Shyam", 17);
		obj.M1("Raju", 30);
		
	}

}
