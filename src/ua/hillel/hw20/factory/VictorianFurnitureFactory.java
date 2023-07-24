package ua.hillel.hw20.factory;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Sofa createSofa() {
		System.out.println("Here is your Victorian sofa");
		return new VictorianSofa();
		
	}

	@Override
	public Chair createChair() {
		
		System.out.println("Here is your Victorian chair");
		return new VictorianChair();
	}

	
}
