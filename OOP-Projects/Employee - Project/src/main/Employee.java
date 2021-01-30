package main;

public class Employee {
	
	private String name,lastName;
	int id;
	
	public Employee(String name, String lastName, int id) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String toString() {
		return "Details of Employee"
				+ "\nID : "+id+
				"\nName : "+name+
				"\nLastname : "+lastName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.print(toString());
	}
	
}
