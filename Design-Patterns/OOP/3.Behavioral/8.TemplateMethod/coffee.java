public abstract class coffee{

	public abstract void coffeeShot();
	public abstract void sugar();
	public abstract void coffeeName();

	public final void make(){
		System.out.println("Coffee Order\n");
		coffeeShot();
		sugar();
		coffeeName();
		System.out.println("\n");
	}
}
