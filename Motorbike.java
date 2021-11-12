package qa.Vehicle;

public class Motorbike extends Vehicle{


	private int numberOfGears;
	private boolean helmet;
	
	//CONTRUCTOR
	
	public Motorbike(String maxSpeed, int wheels, String powerSource, int numberOfGears, boolean helmet) {
		super(maxSpeed, wheels, powerSource);
		this.numberOfGears = numberOfGears;
		this.helmet = helmet;
	}


	//NUMBEROFGEARS GETTER SETTER
	public int getNumberOfGears() {
		return numberOfGears;
	}


	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}


	//HELMET GETTER SETTER
	public boolean isHelmet() {
		return helmet;
	}


	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}


	//OVERRIDE METHOD
	@Override
	public double calculateBill() {
		
		return this.getNumberOfGears()*30;
	}



	
}
