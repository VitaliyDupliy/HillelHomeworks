package ua.hillel.hw14.coffe.order;

public class App {

	public static void main(String[] args) {
		
		Order order1 = new Order("Jack");
		Order order2 = new Order("Mark");
		Order order3 = new Order("Linda");
		Order order4 = new Order("Valery");
		
		CoffeOrderBoard board = new CoffeOrderBoard();
		board.add(order1);
		board.add(order2);
		board.add(order3);
		board.add(order4);
		
		board.draw();
		board.deliverByNumber(3);
		System.out.println("****************");
		
		board.draw();
		
		
	}

}
