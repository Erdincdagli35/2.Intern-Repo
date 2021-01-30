import java.util.HashMap; 


class PlayerFactory{
	
	private static HashMap<String,player> h = new HashMap<String,player>();

	public static player getPlayer(String type){
		player p =null;

		if(h.containsKey(type))
			p=h.get(type);
		else{
			switch(type){
				
			case "samurai":
				System.out.println("Samurai is created");
				p = new samurai();
				break;

			case "fighter":                                                                                  System.out.println("Fighter is created");                                                p = new fighter();                                                                       break;
														case "vampire":                                                                                  System.out.println("vampire is created");                                                p = new vampire();                                                                       break;
														default:																						 System.out.println("Noneee...");

			}
			h.put(type,p);
		}
		return p;
	}	
}
