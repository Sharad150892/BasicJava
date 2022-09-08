package abstraction1;

public abstract class Child extends Parent{
	
	
	@Override
	public abstract int Signal();
	
	
	public abstract void Messenger(int a);
	
	public String Insta(int a, boolean b) {
			
		System.out.println("Method of Insta");
			
		return "Sharad";	
	}

}
