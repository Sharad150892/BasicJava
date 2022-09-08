package interfaces2;

import interfaces.Parent1;
import interfaces.Parent2;

public class ChildAnotherPackage implements Parent1, Parent2 {

	@Override
	public void Position() {
		System.out.println("Method of Position");
		
	}

	@Override
	public void Portfolio() {
		System.out.println("Method of Portfolio");
		
	}

	@Override
	public void Order() {
		System.out.println("Method of Order");
		
	}

	@Override
	public void SignUp() {
		System.out.println("Method of SignUp");
		
	}

	@Override
	public void Homepage() {
		System.out.println(" Method of Homepage");
		
	}

	@Override
	public void BuyStock() {
		System.out.println("Method of BuyStock");
		
	}

	@Override
	public void SellStock() {
		System.out.println("Method of SellStock");
		
	}
		public static void main(String[] args) {
			ChildAnotherPackage obj = new ChildAnotherPackage();
			obj.SignUp();
			obj.Homepage();
			obj.BuyStock();
			obj.SellStock();
			obj.Portfolio();
			obj.Position();
			obj.Order();
			System.out.println(a);
		}
	

}
