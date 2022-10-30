package encapsulation3;

public class Master {
	
	private int sal = 50000;	//Data hiding

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}
