package RunnerGarage;

import qa.Garage.Garage;
import qa.Vehicle.Bicycle;
import qa.Vehicle.Car;
import qa.Vehicle.Motorbike;

public class Runner extends Garage{
	
public static void main(String[] args) {
	
	//NEW CARS
	Car car1 = new Car("200", 4, "petrol", 5, 1.6);
	Garage.addVehicle(car1);
	
	Car car2 = new Car("220", 4, "diesel", 3, 1.2);
	Garage.addVehicle(car2);
	
	Car car3= new Car("190", 4, "electric", 3, 1.4);
	Garage.addVehicle(car3);
	
	
	
	//NEW MOTORBIKES
	Motorbike motorbike1 = new Motorbike("250", 2, "diesel", 6, true);
	Garage.addVehicle(motorbike1);
	
	Motorbike motorbike2 = new Motorbike("185", 2, "petrol", 5, true);
	Garage.addVehicle(motorbike2);
	
	Motorbike motorbike3 = new Motorbike("190", 2, "diesel", 5, true);
	Garage.addVehicle(motorbike3);
	
	
	
	//NEW BICYCLES
	Bicycle bicycle1 = new Bicycle("65", 2, "man power", true, 35.5);
	Garage.addVehicle(bicycle1);
	
	Bicycle bicycle2 = new Bicycle("80", 2, "manpower", true, 38);
	Garage.addVehicle(bicycle2);
	
	Bicycle bicycle3 = new Bicycle("75", 2, "electric", true, 38.5);
	Garage.addVehicle(bicycle3);
	
}
}
