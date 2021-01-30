public abstract class cleaning implements houseKeeping{
	
	protected cleaning nextDuty;

	public void getNextDuty(cleaning duty){this.nextDuty=duty;}
	public void start(house h){
		this.cleanIt(h);
		if(nextDuty!=null)
			nextDuty.start(h);
	}
}
