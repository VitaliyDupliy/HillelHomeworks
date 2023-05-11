package ua.hillel.hw4;

public abstract class Animals {
	
	String name;
	int distanceRun;
	int distanceSwim;
	
	public Animals(String name) {
		
		this.name = name;
		
	}
	
	abstract void run(int distanceRun);
	
    void swim(int distanceSwim) {
    	
    }

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + "]";
	}

	
	
	

}
