
public class Dranza extends Beyblade{
	
	private String monster,specialSkill;
	
	public Dranza(String beybladePlayer, int speedOfBeyblade, int powerOfBeyblade,String monster,String specialSkill) {
		super(beybladePlayer, speedOfBeyblade, powerOfBeyblade);
		this.monster=monster;
		this.specialSkill=specialSkill;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beMonster() {
		// TODO Auto-generated method stub
		super.beMonster();
		System.out.println(getBeybladePlayer()+" -> "+monster+
						   getBeybladePlayer()+" - Special Skill : Flames Sword");
	}

	@Override
	public void printAllDetails() {
		// TODO Auto-generated method stub
		super.printAllDetails();
		System.out.println("Monster : "+monster);
	}
	
	
}
