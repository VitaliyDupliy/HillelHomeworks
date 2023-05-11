package ua.hillel.hw8.task0;

public class TestApp {

	public static void main(String[] args) {

		GeometricFigure c = new Circle(10.5);
		GeometricFigure tr = new Triangle(10.6, 12, 11);
		GeometricFigure sq = new Square(5.8);

		System.out.println(c.areasCalc());
		System.out.println(sq.areasCalc());
		System.out.println(tr.areasCalc());

		GeometricFigure[] fig = { c, tr, sq };
		totalArea(fig);

	}

	static double totalArea(GeometricFigure[] f) {

		double totalArea = 0;

		for (GeometricFigure x : f) {
			totalArea += x.areasCalc();
		}
		System.out.println("Total area for elements of " + f.getClass().getSimpleName() + " = " + totalArea);
		return totalArea;
	}

}
