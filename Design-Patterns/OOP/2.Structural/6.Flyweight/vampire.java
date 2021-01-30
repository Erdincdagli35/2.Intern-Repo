class vampire implements player{
	
	private final String task;
	private String weapon;

	public vampire(){task="Bite the fighter. ";}

	public void getWeapon(String weapon){this.weapon=weapon;}
	public void misson(){System.out.println("Vampire with weapon "+weapon+"\n"+
						"Task is "+task);}

}
