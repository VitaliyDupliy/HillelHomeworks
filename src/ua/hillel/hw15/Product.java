package ua.hillel.hw15;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
 

public class Product {

	private String tipe;
	private double price;
	private boolean discountAble;
	static final LocalDate dataOFAdding = LocalDate.now();
	
	

	public Product(String tipe, double price, boolean discountAble) {
		this.tipe = tipe;
		this.price = price;
		this.discountAble = discountAble;
		
	}

	/*
	 * 1.2 Реалізувати метод отримання всіх продуктів у вигляді списку, категорія яких еквівалентна “Book”
	 *  та ціна більш ніж 250.
	 */

	public static List<Product> groupProd250(List<Product> prod) {
		return prod.stream().filter(p -> p.getTipe() == "Book" & p.getPrice() > 250)
				.collect(Collectors.toList());
	}

	/*
	 * 2.2 Реалізувати метод отримання всіх продуктів як списку, категорія яких еквівалентна “Book”
	 *  і з можливістю застосування знижки. Фінальний список повинен містити продукти з застосованою 
	 *  знижкою 10%. Так, якщо Продукт A був з ціною 1.0 USD, то його фінальна ціна залишатиметься 0.9 USD
	 */

	public static List<Product> discountProd(List<Product> prod) {
		return prod.stream()
				.filter(p -> p.getTipe() == "Book" & p.isDiscountAble())
				.map(p -> {
			p.setPrice(p.getPrice() * 0.9);
			return p;
		})
				.collect(Collectors.toList());
	}
	
	
	//3.2 Реалізувати метод отримання найдешевшого продукту з категорії “Book”
	
	public static Product cheapestProd (List<Product> prod) {
						 
		return  prod.stream()
				.filter(p -> p.getTipe() == "Book")
				.min((a,b) -> Double.compare(a.getPrice(), b.getPrice())).get();
		
		}
		 
		//4.2 Реалізувати метод отримання трьох останніх доданих продуктів
	
	public static List<Product> find3LastProd (List<Product> prod) {
		
	    return prod.subList((prod.size() - 3) , prod.size());
	}
	
	/*
	 * 5.2 Реалізувати метод калькуляції загальної вартості продуктів, які відповідають наступним критеріям:

- продукт додано протягом поточного року

- продукт має тип “Book”

- ціна продукту не перевищує 75
	 */
	
	public static double totalCostProducts (List<Product> prod, String tipe ) {
		return prod.stream()
				.filter(p -> p.getDataOFAdding().getYear() == LocalDate.now().getYear()
				& (p.getTipe() == tipe) & (p.getPrice() <= 75))
				.map(p -> p.getPrice()).reduce((a,p) -> a + p).get();
					 				
	}
	
	/*
	 * 6.2 Реалізувати метод групування об'єктів за типом продукту. Таким чином результатом 
	 * виконання методу буде тип даних “Словник”, що зберігає пару ключ-значення: 
	 * {тип: список_продуктів}
	 */

	public static Map<String, List<Product>> groupProduct (List<Product> prod) {
//		Map<String, ArrayList<Product>> tipesMap = new HashMap<>();
//		prod.stream().forEach(p -> {if(tipesMap.containsKey(p.getTipe())) {
//			
//			tipesMap.get(p.getTipe()).add(p);
//		} else {
//			tipesMap.putIfAbsent(p.getTipe(), new ArrayList<Product>());
//			tipesMap.get(p.getTipe()).add(p);
//		}
//				
//				});
//		
//		return tipesMap;
		
		 Map<String, List<Product>> map = prod.stream()
				 .collect(Collectors.groupingBy(p -> p.getTipe()));
		 for(Map.Entry<String, List <Product>> entry: map.entrySet()) {
			 System.out.println(entry.getKey() + ": " + entry.getValue());
		 }
				
				return map;
	}
	
	
	public boolean isDiscountAble() {
		return discountAble;
	}



	public LocalDate getDataOFAdding() {
		return dataOFAdding;
	}



	public String getTipe() {
		return tipe;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [tipe=" + tipe + ", price=" + price + ", discountAble=" + discountAble 
				+ " dataOFAdding " + LocalDate.now() +"]";
	}

}
