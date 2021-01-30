public class mainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		Figure tri = new Triangle("Eþkenar Üçgen",5,5,5);
		Figure squ = new Square("Kare",5);
		Figure cir = new Circle("Top",10);
		
		tri.printAllDetails();
		squ.printAllDetails();
		cir.printAllDetails();
		
		System.out.println("BYE");
	}

}
