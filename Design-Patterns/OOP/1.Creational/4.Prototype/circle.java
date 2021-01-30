public class circle extends shape{

	public circle(){
		
		type = "Circle";
	}

	@Override
	public void draw(){
		System.out.println("Inside Circle::draw() method.");
	}
}
