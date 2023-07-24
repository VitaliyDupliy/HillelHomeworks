package ua.hillel.hw20.builder;

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		Car sportCar = director.createSportCar(CarType.SPORTS_CAR);
		System.out.println(sportCar);
		
		Car sityCar = director.CityCar(CarType.CITY_CAR);
		System.out.println(sityCar);
		

	}

}
