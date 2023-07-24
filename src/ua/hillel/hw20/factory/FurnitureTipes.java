package ua.hillel.hw20.factory;

public enum FurnitureTipes {

	MODERN, ARDECO, VICTORIAN;
	
	public static FurnitureFactory selectFactory (FurnitureTipes tipe) {
		
		FurnitureFactory choice = null;
		
		switch (tipe){
		
		case MODERN:
			choice = new ModernFurnitureFactory();
			break;
		case ARDECO:
			choice = new ArDecoFurnitureFactory();
			break;
		case VICTORIAN:
			choice = new VictorianFurnitureFactory();
			break;
			
		}
		
		return choice;
		
		
	}
}
