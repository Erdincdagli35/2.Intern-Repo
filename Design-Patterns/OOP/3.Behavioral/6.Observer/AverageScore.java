class AverageScore{
	
	private int sprintRate;
	private int predictedScore;

	public void update(int sprint,int pass,int shoot){
		this.sprintRate = sprint;
		this.predictedScore = this.sprintRate*50;
		toPrint();
	}
	public String toString(){
		return "Averange Score : "+
		       "\nSprint Rate :  "+sprintRate+"\n"+
		       "\nPredicted Score :  "+predictedScore;
	}
	public void toPrint(){
		System.out.println(toString());
	};
}
