
public class mainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("HELLO\n");
		
		/*Subscribe s = new Subscribe();
		s.name="Erdinç Daðlý";
		s.city="Ýzmir";
		s.balance=100;
		
		s.useNaturalGas(100);*/
		
		AdvancedSubscribe s = new AdvancedSubscribe("Erdinç Daðlý","Ýzmir",200);
		s.print();
		
		System.out.print("\nBYE");
		
	}

}
