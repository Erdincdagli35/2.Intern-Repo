/**
 * 
 */

/**
 * @author Erdinc
 *
 */
public class mainDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		IEngineer engineer = new PCEngineer(false,false);
		engineer.soldierState();
		engineer.criminalRecord();
		System.out.println(engineer.graduteNote(2.80));
		String[] exp = {"NETAÞ"};
		engineer.wordExpirement(exp);
		
		IEngineer engineer2 = new MachineEngineer(true,false);
		String[] exp2 = {};
		String[] reference = {"Ümit Songün","Erdinç Daðlý"};
		engineer2.soldierState();
		engineer2.criminalRecord();
		System.out.println(engineer.graduteNote(2.55));
		engineer2.wordExpirement(exp2);
		((MachineEngineer)engineer2).getReference(reference);
		((MachineEngineer)engineer2).init();
		
		System.out.println("BYE");
	}

}
