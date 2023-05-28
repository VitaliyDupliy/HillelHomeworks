package ua.hillel.hw15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Product p1 = new Product("Book", 280, true);
		Product p2 = new Product("Toy", 15, true);
		Product p3 = new Product("Food", 350, false);
		Product p4 = new Product("Book", 50, true);
		Product p5 = new Product("Dress", 150, false);
		Product p6 = new Product("Dress", 300, true);
		Product p7 = new Product("Food", 100, true);
		Product p8 = new Product("Dress", 60, true);
		Product p9 = new Product("Book", 51, true);
		Product p10 = new Product("Toy", 50, true);
		
	
		List<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);		
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
		
//		System.out.println(Product.totalCostProducts(list));
//		System.out.println(Product.groupProd250(list));
//		System.out.println(Product.discountProd(list));
//		System.out.println(Product.cheapestProd(list));
//		System.out.println(Product.find3LastProd(list));
//		System.out.println(Product.totalCostProducts(list, "Dress"));
//		System.out.println(Product.groupProduct (list));
		Product.groupProduct (list);
		
	}

}
