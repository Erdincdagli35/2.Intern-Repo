
public class BeybladeFactory {

	public Beyblade productionBeyblade(String beybladeType) {
		if(beybladeType.equals("Dragon"))
			return new Dragon("Takao",800,300,"Blue Dragon","Speaking Monsters");
		else if(beybladeType.equals("Dranza"))
			return new Dragon("Kai",600,400,"Red Phoenix","Speaking Monsters");
		else if(beybladeType.equals("Drayga"))
			return new Dragon("Rei",800,250,"Whitee Tiger","Speaking Monsters");
		else if(beybladeType.equals("Draciel"))
			return new Dragon("Max",400,1000,"Dark Turtle","Speaking Monsters");
		else
			return null;
	}
}
