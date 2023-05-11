package ua.hillel.hw8.task0;

public class Circle extends GeometricFigure implements CalculatedAreas{
	
	double radius;
	double square;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	
	public double areasCalc() {
		double circleArea = Math.PI * Math.sqrt(radius);
		return circleArea;
	}

	 
	

}
