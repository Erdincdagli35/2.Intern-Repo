import java.util.Hashtable;

public class shapeCache{

	private static Hashtable<String,shape> shapeMap = new Hashtable<String,shape>();
	public static shape getShape(String shapeId){
	
		shape cachedShape = shapeMap.get(shapeId);
		return (shape) cachedShape.clone();
	}

	public static void loadCache(){
	
		circle c = new circle();
		c.setId("1");
		shapeMap.put(c.getId(),c);

		square s = new square();                                                               s.setId("2");                                                                          shapeMap.put(s.getId(),s);

		rectangle r = new rectangle();                                                         r.setId("3");                                                                          shapeMap.put(r.getId(),r);
	}

}
