
public class Numerical extends Participant {

	
	
	public Numerical(int turkish, int math, int literature, int physics, String name) {
		super(turkish, math, literature, physics, name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int calucatePoint() {
		// TODO Auto-generated method stub
		return getTurkish()*5+getMath()*5+getPhysics()*4+getLiterature();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
