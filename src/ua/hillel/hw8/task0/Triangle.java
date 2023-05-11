package ua.hillel.hw8.task0;



public class Triangle extends GeometricFigure implements CalculatedAreas{
	
	double sideA;
	double sideB;
	double sideC;
	double square;
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	  boolean checkTriangle() {
		boolean answer;
		if ((sideA + sideB) > sideC & (sideA + sideC) > sideB & (sideB + sideC) > sideA) {
			answer = true;
					
		} else {
			System.out.println("It is not triangle");
			answer = false;
		}
		
		return answer;
	}

	public double areasCalc() {
		double triangleArea = 0;
		if(checkTriangle()) {
			double halfPerimeter = (sideA + sideB + sideC) / 2;
			 triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));

			 
		}
		return triangleArea;
	}
}
