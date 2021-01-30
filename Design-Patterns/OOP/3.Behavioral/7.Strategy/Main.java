public class Main{
	public static void main(String args[]){
		
		Context c = new Context(new doMathOperationAdd());
		System.out.println("Result : "+c.execute(11,2));
		System.out.println("Result : "+c.execute(11,22));

		Context c2 = new Context(new doMathOperationSub());
		System.out.println("Result : "+c2.execute(11,22));

		Context c3= new Context(new doMathOperationMultiply());                                      System.out.println("Result : "+c3.execute(111,2)); 
	}
}
