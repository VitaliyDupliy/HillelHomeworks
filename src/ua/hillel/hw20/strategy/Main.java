package ua.hillel.hw20.strategy;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();

		context.setStrategy(new TriangleAreaStrategy());
		context.executeStrategy(18,25,30);
		
		Context context2 = new Context();
		
		context2.setStrategy(new RectangleAreaStrategy());
		context2.executeStrategy(10,20);
	}
	

}
