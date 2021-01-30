public class main{

	public static void main(String[] args){
		
		shapeCache.loadCache();

		shape cShape = (shape) shapeCache.getShape("1");
		System.out.println("Shape : "+cShape.getType());

		shape cShape2 = (shape) shapeCache.getShape("2");                                      System.out.println("Shape : "+cShape2.getType());

		shape cShape3 = (shape) shapeCache.getShape("3");                                      System.out.println("Shape : "+cShape3.getType());
	
	
	}

}
