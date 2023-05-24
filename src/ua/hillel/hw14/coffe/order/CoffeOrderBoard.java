package ua.hillel.hw14.coffe.order;

import java.util.LinkedList;



public class CoffeOrderBoard {
	
    private LinkedList<Order> board = new LinkedList<>();

			

	public void add (Order ord) {
		
			ord.setOrderNumber(board.size() + 1);
			board.add(ord);
		}
		
		
	
	public  void deliver () {
		board.poll();
	}
	public  void deliverByNumber (int num) {
		board.remove(num - 1);
	}
	
	public  void draw () {
		System.out.println("NUM | NAME");
		System.out.println("__________");
		for(Order ord : board) {
			System.out.println(ord);
		}
	}



	
}
