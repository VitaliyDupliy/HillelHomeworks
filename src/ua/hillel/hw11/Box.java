package ua.hillel.hw11;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

	private List<T> items = new ArrayList<>();
	

	

	public void addOneFruit(T fruit) {
		items.add(fruit);
	}

	public void addSomeFruit(int quantity, T fruit) {
		for(int i = 0; i < quantity; i++) {
			items.add(fruit);
		}
	}
	
	public float getWeight() {
		float boxWeight = 0;
		if(items.size() != 0) {
		 boxWeight = items.size() * items.get(0).getWeight();
		 
		} else {
			System.out.println("Box is empty");
		}
		return boxWeight;
		
	}
	
	public boolean compareWeigthOfBoxes(Box <? extends Fruit> fruit) {
		if(this.getWeight() == fruit.getWeight()) {
			return true;
		}
		return false;
		
	}
	
	public void merge (Box <T> fruit) {
		for(T fruits: fruit.items) {
			this.items.add(fruits);
		}
		fruit.items.clear();
		System.out.println("Merge is done ");
	}


	@Override
	public String toString() {
		return "Box of " + items.get(0).getClass().getSimpleName() + ":" + items ;
	}

	
}
