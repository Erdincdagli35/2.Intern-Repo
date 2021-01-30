package main;

public class Prime extends Employee{

	private int numberOfPeopleWhoAreResponsible;
	public Prime(String name, String lastName, int id,int responsibleNumber) {
		super(name, lastName, id);
		this.numberOfPeopleWhoAreResponsible=responsibleNumber;
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.print("Number Of People Who Are Responsible : "+numberOfPeopleWhoAreResponsible);
	}

	public void makeARise(int value) {
		System.out.print(getName()+" making a rise for employee : "+value);
	}
	
}
