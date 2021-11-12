package qa.Vehicle;

public abstract class Vehicle{
	
	private String maxSpeed;
	private int wheels;
	private String powerSource;
	
	
	//CONSTRUCTOR
	public Vehicle(String maxSpeed, int wheels, String powerSource) {
		super();
		this.maxSpeed = maxSpeed;
		this.wheels = wheels;
		this.powerSource = powerSource;
	}
	
	public abstract double calculateBill();
	

	//MAXSPEED GETTER SETTER
	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
	//WHEELS GETTER SETTER
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	
	//POWERSOURCE GETTER SETTER
	public String getPowerSource() {
		return powerSource;
	}

	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}

	
	//OVERRIDE METHOD
	
	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + ", wheels=" + wheels + ", powerSource=" + powerSource + "]";
	}
	
	
	
	
	}


