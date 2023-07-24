package ua.hillel.hw20.factory;

public class Main {

	public static void main(String[] args) {
		FurnitureFactory  modernFactory = FurnitureTipes.selectFactory(FurnitureTipes.MODERN);
		FurnitureFactory  victorianFactory = FurnitureTipes.selectFactory(FurnitureTipes.VICTORIAN);
		FurnitureFactory  arDecoFactory = FurnitureTipes.selectFactory(FurnitureTipes.ARDECO);
		
		modernFactory.createChair().sitOn();
		modernFactory.createSofa().lyingOn();
		System.out.println();
		
		victorianFactory.createChair().sitOn();
		victorianFactory.createSofa().lyingOn();
		System.out.println();
		
		arDecoFactory.createChair().sitOn();
		arDecoFactory.createSofa().lyingOn();
		System.out.println();
	}

}
