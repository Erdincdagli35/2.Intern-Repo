
public class PCEngineer implements IEngineer {
	
	private boolean soldierState;
	private boolean criminalRecord;
	
	public PCEngineer(boolean soldierState, boolean criminalRecord) {
		super();
		this.soldierState = soldierState;
		this.criminalRecord = criminalRecord;
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
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	

}
