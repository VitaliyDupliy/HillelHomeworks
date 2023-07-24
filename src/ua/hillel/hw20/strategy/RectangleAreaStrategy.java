package ua.hillel.hw20.strategy;

public class RectangleAreaStrategy implements CalcAreaStrategy {

	@Override
	public double calcArea(double... numbers) {
		
		double area = numbers[0] * numbers[1];
		
		System.out.println("This rectangle area = " + area);
		return area;
	}

}
