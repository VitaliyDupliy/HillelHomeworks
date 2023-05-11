package ua.hillel.hw3.forCar;

public class Car {
	
	private void startElectricity() {
		System.out.println("Electricity is started");
	} 
	
	
	private void startCommand() {
		System.out.println("Command is started");
	}
	
	
	private void startFuelSystem() {
		System.out.println("FuelSystem is started");
	}
	
	

	public void start() {
		startElectricity();
		startCommand();
		startFuelSystem();
		System.out.println("Ready to drive");
	}
}



 class CarDrive{
	 
	 public static void main(String[] args) {
		
		 Car vv = new Car();
		 
		 vv.start();
	}
	 
 }
	 
	

