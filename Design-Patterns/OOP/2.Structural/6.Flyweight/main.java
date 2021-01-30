import java.util.Random; 

public class main{
	private static String[] playerType = {"vampire","fighter","samurai"};
	private static String [] weapons = {"Sword", "Desert Eagle","Ak47"};

	public static void main(String [] args){
		
		for(int i = 0; i< 10;i++){
			
			player p = PlayerFactory.getPlayer(getRandPlayerType());
			p.getWeapon(getRandWeapon());
			p.misson();
		}
	}
	public static String getRandPlayerType(){
		Random r = new Random();
		int randInt = r.nextInt(playerType.length);
		
		return playerType[randInt]; 
	}
	public static String getRandWeapon(){
		Random r = new Random();
		int randInt = r.nextInt(weapons.length);

		return weapons[randInt];
	}
}
