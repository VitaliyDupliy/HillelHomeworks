package ua.hillel.hw20.builder;

public class Car {
	
	private CarType carType;
	private Engine engine;
	private int seats;
	private Transmission transmission;
	private boolean  isTripcomputer;
	private GPSnavigator gpsNavigator;
	private FuelType fuelType;
	private boolean carRoofRack;
	private int yearOfProduction;
	private int mileage;

	
	
	@Override
	public String toString() {
		return "Car [carType=" + carType + ", engine=" + engine + ", seats=" + seats + ", transmission=" + transmission
				+ ", isTripcomputer=" + isTripcomputer + ", gpsNavigator=" + gpsNavigator + ", fuelType=" + fuelType
				+ ", carRoofRack=" + carRoofRack + ", yearOfProduction=" + yearOfProduction + ", mileage=" + mileage
				+ "]";
	}



	public static class CarBuilder {
		
		private Car newCar;
		
		public CarBuilder() {
			this.newCar = new Car();
		}

		public Car build() {
			return  newCar;
		}
		
		
		public CarBuilder carType (CarType carType) {
			this.newCar.carType = carType;
			return this;
		}
		
		public CarBuilder engine (Engine engine) {
			this.newCar.engine = engine;
			return this;
		}
		
		@Override
		public String toString() {
			return "CarBuilder [newCar=" + newCar + "]";
		}

		public CarBuilder seats (int seats) {
			this.newCar.seats = seats;
			return this;
		}
		
		public CarBuilder transmission (Transmission transmission) {
			this.newCar.transmission = transmission;
			return this;
		}
		
		public CarBuilder tripcomputer (boolean isTripcomputer) {
			this.newCar.isTripcomputer = isTripcomputer;
			return this;
		}
		
		public CarBuilder gpsNavigator (GPSnavigator gpsNavigator) {
			this.newCar.gpsNavigator = gpsNavigator;
			return this;
			
		}
		
		public CarBuilder fuelType (FuelType fuelType) {
			this.newCar.fuelType = fuelType;
			return this;
			
		}
		
		public CarBuilder carRoofRack (boolean carRoofRack) {
			this.newCar.carRoofRack = carRoofRack;
			return this;
			
		}
		
		public CarBuilder yearOfProduction (int yearOfProduction) {
			this.newCar.yearOfProduction = yearOfProduction;
			return this;
			
		}
		
		public CarBuilder mileage (int mileage) {
			this.newCar.mileage = mileage;
			return this;
			
		}
		
		
		
	}
}
