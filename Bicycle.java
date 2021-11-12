package qa.Vehicle;

public class Bicycle extends Vehicle {

	private boolean mudGuard;
	private double wheelDiameter;
	
	
	
	//CONSTRUCTOR
	public Bicycle(String maxSpeed, int wheels, String powerSource, boolean mudGuard, double wheelDiameter) {
		super(maxSpeed, wheels, powerSource);
		this.mudGuard = mudGuard;
		this.wheelDiameter = wheelDiameter;
	}

	
	
	//MUDGUARD GETTER SETTER
	public boolean isMudGuard() {
		return mudGuard;
	}




	public void setMudGuard(boolean mudGuard) {
		this.mudGuard = mudGuard;
	}




	//WHEELDIAMETER GETTER SETTER
	public double getWheelDiameter() {
		return wheelDiameter;
	}




	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}


	//OVERRIDE METHOD

	@Override
	public double calculateBill() {
		
		return this.getWheels()*50;
	}




}
