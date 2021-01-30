public class main{
	public static void main(String[] args){
		vehicle car = factoryPart.getInstance("car",3);
		System.out.println(car.toString());

		vehicle bike = factoryPart.getInstance("bike",2);                                      System.out.println(bike.toString());
	}
}
