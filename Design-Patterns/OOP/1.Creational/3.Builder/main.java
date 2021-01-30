public class main{
        public static void main (String[] args){
		mealbuilder mB =new mealbuilder();

		meal veg = mB.prepareVegMeal();
		System.out.println("Veg Meal 1");
		veg.showItems();
		System.out.println("Total Cost: "+veg.getCost());

		meal nonVegM = mB.prepareNonVegMeal();                                                 System.out.println("\n\nNon-Veg Meal 2");                                              nonVegM.showItems();                                                                   System.out.println("Total Cost: "+nonVegM.getCost()); 

	} 
}
