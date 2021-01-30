
public abstract class Figure {

	protected String name;
	
	public Figure(String name) {
		this.name=name;
	}
	
	abstract double calculationArea();
	abstract String getString();
	abstract void printAllDetails();
}
