public class pcFactory implements abstractFactory<pc>{
	
	@Override 
	public pc produce(String type ){
		
		if("Lenova".equalsIgnoreCase(type))
			return new lenova();
		else if("Dell".equalsIgnoreCase(type))
			return new dell();
		else if("Macbook".equalsIgnoreCase(type))                                                         return new mac();
		else
			return null;
		
	}
	@Override
	public pc  getFactoryName(String name){
		return name;
	
	}

}
