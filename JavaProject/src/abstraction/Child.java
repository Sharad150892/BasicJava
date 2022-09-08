package abstraction;

public abstract class Child extends Parent{

	@Override
	void BookingAirIndiaFlight() {
		System.out.println("Method of AirIndia");
		
	}

	abstract void Spicejet();
	

}
