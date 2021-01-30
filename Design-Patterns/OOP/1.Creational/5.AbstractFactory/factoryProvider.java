public class factoryProvider {

	public static abstractFactory getFactory(String choice){
	
		if("Phone".equalsIgnoreCase(choice))
			return new phoneFactory();
		else if("Pc".equalsIgnoreCase(choice))                                                           return new pcFactory();
		else
			return null;
	}

}
