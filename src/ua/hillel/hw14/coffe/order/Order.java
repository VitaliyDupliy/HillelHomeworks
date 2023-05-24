package ua.hillel.hw14.coffe.order;

public class Order {
	
	private final String customerName;
	private int orderNumber;
	
	
	public Order(String customerName) {
		this.customerName = customerName;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}


	
	@Override
	public String toString() {
		return orderNumber + "   | " + customerName;
	}
	
	

}
