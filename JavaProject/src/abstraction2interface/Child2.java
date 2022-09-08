package abstraction2interface;

public abstract class Child2 implements Parent, Child  {

	@Override
	public abstract void Nextpage();

	@Override
	public abstract void Navigation();

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Method of Login");
	}

	@Override
	public void homepage() {
		// TODO Auto-generated method stub
		System.out.println("Method of Homepage");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Method of Logout");
	}
	
}
