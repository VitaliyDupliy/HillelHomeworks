package ua.hillel.hw4;

public class Dog extends Animals {
	
	 

	public Dog(String name) {
		super(name);
		
	}

	@Override
	void run(int distanceRun) {
		
		if(distanceRun > 500)
			System.out.println("Dog cannot run over 500 meters!!!");
		else
		System.out.println("Dog \'" + name + "\' has run " + distanceRun + " meters");
		
	}

	
	void swim(int distanceSwim) {
		
		if(distanceSwim > 10)
			System.out.println("Dog cannot swim over 10 meters!!!");	
		else
		
		System.out.println("Dog \'" + name + "\' has swim " + distanceSwim + " meters");
	}
	
	

}
