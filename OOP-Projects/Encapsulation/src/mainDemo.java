
public class mainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("HELLO\n");
		
		/*Subscribe s = new Subscribe();
		s.name="Erdin� Da�l�";
		s.city="�zmir";
		s.balance=100;
		
		s.useNaturalGas(100);*/
		
		AdvancedSubscribe s = new AdvancedSubscribe("Erdin� Da�l�","�zmir",200);
		s.print();
		
		System.out.print("\nBYE");
		
	}

}
