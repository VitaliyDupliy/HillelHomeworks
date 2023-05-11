package ua.hillel.hw4;

public class Cat extends Animals {
	
	 
	

	public Cat(String name) {
		super(name);
		
	}


	
	void run(int distanceRun) {
		if (distanceRun > 200)
			System.out.println("Cat cannot run over 200 meters!!!");
		else
		
		System.out.println("Cat \'" + name + "\' has run " + distanceRun + " meters");
	}


	
	void swim() {
		System.out.println("Cats cannot swim!!!");
		
	}
	
	 

}
