public class factoryPart {
	
	public static vehicle getInstance(String type,int wheel)
	{
		if(type == "car"){
			return new car(wheel);
		}
		else if (type=="bike"){
			return new bike(wheel);
		}
		return null;
	}

}
