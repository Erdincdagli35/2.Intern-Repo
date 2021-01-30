
public abstract class Participant {

	private int turkish,math,literature,physics;
	private String name;

	
	public Participant(int turkish, int math, int literature, int physics, String name) {
		super();
		this.turkish = turkish;
		this.math = math;
		this.literature = literature;
		this.physics = physics;
		this.name = name;
	}

	public int getTurkish() {
		return turkish;
	}

	public void setTurkish(int turkish) {
		this.turkish = turkish;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getLiterature() {
		return literature;
	}

	public void setLiterature(int literature) {
		this.literature = literature;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}
	
	abstract int calucatePoint();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Participant [turkish=" + turkish + ", math=" + math + ", literature=" + literature + ", physics="
				+ physics + ", name=" + name + "]";
	}
	
	
}	
