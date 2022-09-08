package abstraction1;

public class Execution extends Child{

	@Override
	public int Signal() {
		// TODO Auto-generated method stub
		System.out.println("Method of Signal");
		return 100;
	}

	@Override
	public void Messenger(int a) {
		// TODO Auto-generated method stub
		System.out.println("Method of Messenger");
		
	}
	
	public static void main(String[] args) {
		Execution obj = new Execution();
		System.out.println(obj.Signal());
		obj.Messenger(10);
		obj.Telegram();
		obj.Whatsapp();
		System.out.println(obj.Insta(1000, true));
		Wechat();
	}
	

}
