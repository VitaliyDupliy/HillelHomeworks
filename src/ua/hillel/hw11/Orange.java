package ua.hillel.hw11;

public class Orange extends Fruit {
	
	 static String name;
	 static final float weight = 1.5f;

	public Orange() {

		Orange.name ="Orange";
		
	}
	

	

	public float getWeight() {
		return weight;
	}




	@Override
	public String toString() {
		return name;
	}
	

}
