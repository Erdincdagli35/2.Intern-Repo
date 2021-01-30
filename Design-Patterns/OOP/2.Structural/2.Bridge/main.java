public class main{
	public static void main(String [] args)
	{
		//electronicTool e = new phone();
		//color c= new black();
		electronicTool e = new phone(new black());
	        System.out.println(e.create()); 	
	
		electronicTool e2 = new pc(new white());                                               System.out.println(e2.create());

		electronicTool e3 = new phone(new blue());                                             System.out.println(e3.create());   	
		
	}

}
