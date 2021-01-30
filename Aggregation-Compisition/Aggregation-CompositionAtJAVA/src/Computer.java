
public class Computer {

	private String CPU,RAM,hardDisk;
	private Bag bag;//Aggregation
	private Microphone mp;//Aggregation
	private Screen screen;//Composition
	private Case cs ;//Composition
	
	public Computer(String cPU, String rAM, String hardDisk, Bag bag,Screen screen,Case cs,Microphone mp) {
		super();
		CPU = cPU;
		RAM = rAM;
		this.hardDisk = hardDisk;
		this.bag=bag;//Aggregation
		this.mp=mp;//Aggregation
		this.screen=new Screen(screen.getName(),screen.getColor());//Composition
		this.cs=new Case(cs.getName(),cs.getType(),cs.getWeight());//Composition

	}
	
	public String getCPU() {
		return CPU;
	}
	
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}
	public Bag getBag() {
		return bag;
	}
	public void setBag(Bag bag) {
		this.bag = bag;
	}

	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", hardDisk=" + hardDisk + 
				", \nbag=" + bag.toString() + 
				", \nscreen="+screen.toString() +
				", \ncase="+cs.toString() +
				", \nmicrophone="+mp.toString() +"]";
	}
	
	
	
}
