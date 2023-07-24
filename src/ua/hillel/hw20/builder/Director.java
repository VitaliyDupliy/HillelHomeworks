package ua.hillel.hw20.builder;

public class Director {

	public Car createSportCar(CarType carType) {
		return new Car.CarBuilder()
				.carType(carType)
				.engine(Engine.TURBO_SPORT_V6)
				.fuelType(FuelType.PETROL)
				.gpsNavigator(new GPSnavigator())
				.seats(2)
				.transmission(Transmission.SEMI_AUTOMATIC)
				.build();
		
	}
	
	public Car CityCar (CarType carType) {
		return new Car.CarBuilder()
				.carType(CarType.CITY_CAR)
				.engine(Engine.ATHMOSFERE_DIESEL_2)
				.seats(4)
				.transmission(Transmission.AUTOMATIC)
				.tripcomputer(true)
				.gpsNavigator(new GPSnavigator())
				.fuelType(FuelType.DIESEL)
				.carRoofRack(true)
				.build();
		
		
	}
}
