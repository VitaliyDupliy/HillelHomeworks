package ua.hillel.hw8.task0;

public class Square  extends GeometricFigure implements CalculatedAreas{
	
	double side;
	double square;
	
	public Square(double side) {
		this.side = side;
	}

	
	public double areasCalc() {
		double squareArea = side * side;
		
		return squareArea;
	}
	
	

}
