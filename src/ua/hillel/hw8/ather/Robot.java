package ua.hillel.hw8.ather;

public class Robot implements Participant {
	
	final double runable = 1000;
	final double jumpable = 3.5;

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

		return runable;
	}

	@Override
	public double getJumpable() {
		return jumpable;
	}

}
