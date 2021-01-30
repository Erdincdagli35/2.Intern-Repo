
public class mainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeybladeFactory factory = new BeybladeFactory();
		Beyblade dranza =factory.productionBeyblade("Dranza");
		dranza.beMonster();
		dranza.attack();
		dranza.printAllDetails();
	}

}
