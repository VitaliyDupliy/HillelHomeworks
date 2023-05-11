package ua.hillel.hw4;

import java.util.ArrayList;


public class App {

	public static void main(String[] args) {
		
		
		Cat cat = new Cat("Barsik");
		cat.swim();
		cat.run(200);
		
		Dog dog = new Dog("Ret");
		
		dog.swim(5);
		dog.swim(11);
		dog.run(550);
		dog.run(350);
		
		 System.out.println(dog.toString());
		 System.out.println(cat.toString());
		 
		 Dog dog1 = new Dog("Chak");
		 Dog dog2 = new Dog("Tuz");
		 Dog dog3 = new Dog("Bim");
		 Dog dog4 = new Dog("Bom");
		 
		 Cat cat1 = new Cat("Tom");
		 Cat cat2 = new Cat("Tim");
		 Cat cat3 = new Cat("Max");
		 
		 ArrayList <Animals> animals = new ArrayList<Animals>();
		 animals.add(cat);
		 animals.add(cat1);
		 animals.add(cat2);
		 animals.add(cat3);
		 animals.add(dog);
		 animals.add(dog1);
		 animals.add(dog2);
		 animals.add(dog3);
		 animals.add(dog4);
		 
		 System.out.println(animals);
		 
		 calculationAnimals(animals);
		 
		 
	}

	static void calculationAnimals(ArrayList<Animals> al) {
		int catsQuantity = 0;
		int dogsQuantity = 0;
		int allAnimals = 0;
		 for(Animals a : al) {
			 if(a.getClass().getSimpleName().equals("Cat")){
				catsQuantity ++; 
			 } else {
				 dogsQuantity ++;
			 }
		 }
		 allAnimals = catsQuantity + dogsQuantity;
		 System.out.println("Quantity of Cats  =  " + catsQuantity);
		 System.out.println("Quantity of Dogs  =  " + dogsQuantity);
		 System.out.println("Quantity of all animals  =  " + allAnimals);
	 }
}
