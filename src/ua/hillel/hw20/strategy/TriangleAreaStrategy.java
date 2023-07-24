package ua.hillel.hw20.strategy;

public class TriangleAreaStrategy implements CalcAreaStrategy {

	
	@Override
	public double calcArea(double... numbers) {
		
		double area = 0;
		if ((numbers[0] + numbers[1]) > numbers[2] & (numbers[0] + numbers[2]) > numbers[1] 
		& (numbers[1] + numbers[2]) > numbers[0]) {
			double halfPerimeter = (numbers[0] + numbers[1] + numbers[2]) / 2;
			
			 area = Math.sqrt(halfPerimeter * (halfPerimeter - numbers[0]) 
					 * (halfPerimeter - numbers[1]) * (halfPerimeter - numbers[2]));
			System.out.println("This triangle area = " + area);
					
		} else {
			throw new IllegalArgumentException("It is not triangle!");
		}
		
		
		 return area;
		
		
	}

	
}
