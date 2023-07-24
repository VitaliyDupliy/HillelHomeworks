package ua.hillel.hw20.factory;

public class ArDecoFurnitureFactory implements FurnitureFactory {

	@Override
	public Sofa createSofa() {
		System.out.println("Here is your Ar-Deco sofa");
		return new ArDecoSofa();
		
	}

	@Override
	public Chair createChair() {
		System.out.println("Here is your Ar-Deco chair");
		return new ArDecoChair();
		
	}

	
}
