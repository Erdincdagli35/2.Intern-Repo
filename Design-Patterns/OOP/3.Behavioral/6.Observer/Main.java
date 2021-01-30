class Main{
	
	public static void main(String atgs[]){
		AverageScore aScore = new AverageScore();
		CurrentScore cScore = new CurrentScore();

		Football f = new Football(cScore,aScore);

		f.dataChanged();
	}
}
