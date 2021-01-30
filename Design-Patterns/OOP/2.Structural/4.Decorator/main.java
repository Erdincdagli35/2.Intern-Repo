class main{
	public static void main(String args [])
	{
		coffee c = new  espresso();
		
		
		coffee c2 = new americano(c);
		c2.toPrint();
		
		
		coffee c3 = new espresso();
		coffee c4 = new latte(c3);
		c4.toPrint();

		coffee c5 = new espressox2(c);                                                           c5.toPrint();
	}
}
