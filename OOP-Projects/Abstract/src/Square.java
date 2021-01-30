
public class Square extends Figure{

	private int border;

	public Square(String name, int border) {
		super(name);
		this.border = border;
	}

	@Override
	double calculationArea() {
		// TODO Auto-generated method stub
		return border*border;
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
