public class cleanInOut{
	
	private static final cleanInOut IO = new cleanInOut();
	private cleaning[] llDoList = null;

	private cleanInOut(){
		llDoList = new cleaning[2];

		cleanOut out =new cleanOut();
		cleanIn in = new cleanIn();

		llDoList[0] = out;
		llDoList[1] = in;

		out.getNextDuty(in);
	}
	public static final cleaning firstDuty(){
		return IO.llDoList[0];
	}
}
