public class Triangle extends Figure{

	private double a,b,c;

	
	public Triangle(String name, int a, int b, int c) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
	}


	@Override
	double calculationArea() {
		// TODO Auto-generated method stub
		double u = (a+b+c)/2.0;
		double area =Math.sqrt(u*(u-a)*(u-b)*(u-c));
		return area;
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
