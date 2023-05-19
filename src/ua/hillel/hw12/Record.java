package ua.hillel.hw12;

public class Record {
	
	private String name;
	private String phoneNumber;
	
	

	public String getName() {
		return name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public Record(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "Record [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
}
