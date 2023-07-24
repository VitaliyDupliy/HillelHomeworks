package ua.hillel.hw20.factory;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Sofa createSofa() {
		System.out.println("Here is your Modern sofa");
		return new ModernSofa();
		
	}

	@Override
	public Chair createChair() {
		System.out.println("Here is your Modern chair");
		return new ModernChair();		
	}

	
}
