public class mealbuilder {
	public meal prepareVegMeal(){
		meal m = new meal();
		m.addItem(new vegburger());
		m.addItem(new coke());
		return m;

	}

	public meal prepareNonVegMeal(){
		meal m = new meal();                                                                   m.addItem(new chickenburger());                                                        m.addItem(new pepsi());                                                                 return m;
	}
}
