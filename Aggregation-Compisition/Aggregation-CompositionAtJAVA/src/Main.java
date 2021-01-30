
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO\n");
		
		Bag bag = new Bag("HP Computer Bag","Black");
		Screen screen = new Screen("Samsung HD ","Black");
		Case cs = new Case("Intel Case","Metal",5.7);
		Microphone mp = new Microphone("TechA","WebCam");
		
		Computer pc = new Computer("Intel i5 4.2 Hertz","4GB DDR RAM","500 GB SAMSUNG Harddisk",bag,screen,cs,mp);
		
		
		System.out.println(pc.toString());
		
		System.out.println("\nBYE");
	}

}
