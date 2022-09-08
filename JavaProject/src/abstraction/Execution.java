package abstraction;

public class Execution extends Child {
	
	
	public static void main(String[] args) {
		Execution obj = new Execution();
		obj.BookingAirIndiaFlight();
		obj.BookingIndigoFlight();
		obj.Spicejet();
	}

	@Override
	void Spicejet() {
		System.out.println("Method of Spice Jet");
		
	}

}
