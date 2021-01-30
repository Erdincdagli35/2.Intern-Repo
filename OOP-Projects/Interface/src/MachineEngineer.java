
public class MachineEngineer implements IEngineer,IInit{

	private boolean soldierState;
	private boolean criminalRecord;
	
	public MachineEngineer(boolean soldierState, boolean criminalRecord) {
		super();
		this.soldierState = soldierState;
		this.criminalRecord = criminalRecord;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("IT WORKS");
	}

	@Override
	public void soldierState() {
		// TODO Auto-generated method stub
		if(soldierState)
			System.out.println("Soldier State is True");
		else
			System.out.println("Soldier State is False");
			
	}

	@Override
	public String graduteNote(double note) {
		// TODO Auto-generated method stub
		
		return "Averange : "+note;
	}

	@Override
	public void criminalRecord() {
		// TODO Auto-generated method stub
		if(criminalRecord)
			System.out.println("Criminal Record exist");
		else
			System.out.println("Criminal Record doesnt exist");
	}

	@Override
	public void wordExpirement(String[] array) {
		// TODO Auto-generated method stub
		if(array.length==0)
			System.out.println("I dont have any experiment");
		else {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}

	 public void getReference(String[] array) {
		if(array.length==0)
			System.out.println("I dont have any reference");
		else {
			System.out.println("References : ");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}

	
}
