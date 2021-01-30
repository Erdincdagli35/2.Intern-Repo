public class Beyblade {
	
	private String beybladePlayer;
	private int speedOfBeyblade,powerOfBeyblade;
	public Beyblade(String beybladePlayer, int speedOfBeyblade, int powerOfBeyblade) {
		this.beybladePlayer = beybladePlayer;
		this.speedOfBeyblade = speedOfBeyblade;
		this.powerOfBeyblade = powerOfBeyblade;
	}
	public String getBeybladePlayer() {
		return beybladePlayer;
	}
	public void setBeybladePlayer(String beybladePlayer) {
		this.beybladePlayer = beybladePlayer;
	}
	public int getSpeedOfBeyblade() {
		return speedOfBeyblade;
	}
	public void setSpeedOfBeyblade(int speedOfBeyblade) {
		this.speedOfBeyblade = speedOfBeyblade;
	}
	public int getPowerOfBeyblade() {
		return powerOfBeyblade;
	}
	public void setPowerOfBeyblade(int powerOfBeyblade) {
		this.powerOfBeyblade = powerOfBeyblade;
	}
	
	public void attack() {
		System.out.println("Beyblade Player : "+getBeybladePlayer()+
							"is attacking with Speed : "+getSpeedOfBeyblade()+
							" and Power : "+getPowerOfBeyblade());
	}
	
	public void beMonster() {
		System.out.println("There's not any monster for you ");
	}
	public String toString() {
		return "Beyblade [beybladePlayer=" + beybladePlayer + ", speedOfBeyblade=" + speedOfBeyblade
				+ ", powerOfBeyblade=" + powerOfBeyblade + "]";
	}
	public void printAllDetails() {
		System.out.println(toString());
	} 
	

}
