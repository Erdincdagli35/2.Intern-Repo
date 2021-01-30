
public class Circle extends Figure{

	private int r;

	public Circle(String name, int r) {
		super(name);
		this.r = r;
	}

	@Override
	double calculationArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

	@Override
	String getString() {
		// TODO Auto-generated method stub
		return "\nFIGURE :"+
			"\nName : "+name+
			"\nArea : "+calculationArea();

	}

	@Override
	void printAllDetails() {
		// TODO Auto-generated method stub
		System.out.println(getString());
	}
	
	
	
}