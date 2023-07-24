package ua.hillel.hw20.strategy;

public class Context {
	
	private CalcAreaStrategy strategy;
	
	public void setStrategy (CalcAreaStrategy strategy) {
		this.strategy = strategy;
	}

	public double executeStrategy(double... numbers) {
		
				return strategy.calcArea(numbers);
	}
}
