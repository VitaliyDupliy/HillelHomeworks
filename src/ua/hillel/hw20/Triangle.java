package ua.hillel.hw20;



public class Triangle {
	
	
	double sideA;
	double sideB;
	double sideC;
	
	

	
	

	 

	public double areasCalc() {
		
			double halfPerimeter = (sideA + sideB + sideC) / 2;
			 return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) 
					 * (halfPerimeter - sideB) * (halfPerimeter - sideC));

			
	}

}
