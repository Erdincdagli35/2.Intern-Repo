class espressox2 extends coffeeDecorator{
	
	coffee c;

	public espressox2(coffee c){this.c=c;}
	public String getName(){return "Coffee : Espresso x2 Shot ";}
	public String getDescription(){
		return c.getDescription()+", Espresso x 2 Cup Coffee ";
	}
	public int getCost(){return 20 + c.getCost();}

}
