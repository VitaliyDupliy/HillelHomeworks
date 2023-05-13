package ua.hillel.hw11;

public class Apple extends Fruit {

	static String name;
	static final float weight = 1.0f;
	
	public Apple() {

		Apple.name = "Apple";
		
	}
	
	public float getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return name ;
	}
	
	

}
