package ua.hillel.hw8.ather;

public class Human implements Participant{
	
	final double runable = 100;
	final double jumpable = 1.5;
	

	@Override
	public String run() {
		
		
		return " has ran";
		
	}

	@Override
	public String jump() {
		return " has jumped over ";
		
	}

	@Override
	public double getRunable() {
		return runable ;
	}

	@Override
	public double getJumpable() {
		return jumpable;
	}
	
}
