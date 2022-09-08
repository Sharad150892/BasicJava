package interfaces2;

public class Child implements Parent1, Parent2 {

	@Override
	public void login(boolean a) {
		System.out.println("Method of Login 1");
	}

	@Override
	public void logout(String UserId) {
		System.out.println("Method of Logout 1");
		
	}

	@Override
	public void login(int a) {
		System.out.println("Method of Login 2");
		
	}

	@Override
	public void logout(int a) {
		System.out.println("Method of Logout 2 ");
		
	}
	
	public static void main(String[] args) {
		Child ob = new Child();
		ob.login(true);
		ob.login(87);
		ob.logout(12);
		ob.logout("SSS");
	}	

}
