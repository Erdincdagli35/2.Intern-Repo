class Animal{
	private String name;

	public Animal(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String speak() {
		return "Animal is speaking";
	}
	
}
class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return this.getName()+": Miaww";
	}
	
	
}
class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return this.getName()+": Haww";
	}
	
	
}
class Horse extends Animal{

	public Horse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return this.getName()+": Ihhh";
	}
	
	
}

public class mainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Cat("Tekir");
		System.out.print(a.speak());
	}

}
