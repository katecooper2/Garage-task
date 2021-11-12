package qa.Vehicle;

public class Car extends Vehicle {

	private int doorNumber;
	private double engineSize;
	
	//CONSTRUCTOR
	public Car(String maxSpeed, int wheels, String powerSource, int doorNumber, double engineSize) {
		super(maxSpeed, wheels, powerSource);
		this.doorNumber = doorNumber;
		this.engineSize = engineSize;
	}

	//DOORNUMBER GETTER SETTER
	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	
    //ENGINESIZE GETTER SETTER
	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	//OVERRIDE METHOD
	@Override
	public double calculateBill() {
		
		return this.getEngineSize()*100;
	}
	
	
	
	
	

}
