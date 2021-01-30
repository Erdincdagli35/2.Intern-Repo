class Football {
	
	int sprint,pass,shoot;

	CurrentScore cScore;
	AverageScore aScore;

	public Football(CurrentScore cScore, AverageScore aScore){
		this.cScore=cScore;
		this.aScore=aScore;
	}

	private int getSprint(){return 75;}
	private int getPass(){return 65;}
	private int getShoot(){return 55;}

	public void dataChanged(){
		sprint = getSprint();
		pass = getPass();
		shoot=getShoot();

		cScore.update(sprint,pass,shoot);
		aScore.update(sprint,pass,shoot);

	}

	
}
