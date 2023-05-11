package ua.hillel.hw3.pack1;

public class Employee {

	private String name;
	private String jobTitle;
	private String email;
	private String phoneNumber;
	private int age;
	
	public Employee(String name, String jobTitle, String email, String phoneNumber, int age) {
		
		this.name = name;
		this.jobTitle = jobTitle;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	
}

class AppEmploee{
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Jack Ritcher", "Direktor", "mail@gmail.com", "0674567891", 45);
		
	
		
	}
	
	
}
