package main;

public class SoftwareEngineer extends Employee{

	private String progLang;
	
	public SoftwareEngineer(String name, String lastName, int id,String progLang) {
		super(name, lastName, id);
		this.progLang=progLang;
		// TODO Auto-generated constructor stub
	}
	
	public void getImaj(String OS) {
		System.out.print(getName()+" "+OS+" is loading...");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.print("\nLearned Prog. Lang. : "+progLang);
	}
	
	

}
