public class main{
	public static void main(String args[]){
		coffee c = new turkishCoffee();
		c.make();

		coffee c2 = new americano();                                                             c2.make();

		coffee c3 = new latte();                                                            	 c3.make();
	}
}
