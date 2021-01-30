
public class Case {

	private String name,type;
	private double weight;
	public Case(String name, String type, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Case [name=" + name + ", type=" + type + ", weight=" + weight + "]";
	}
	
	
}
