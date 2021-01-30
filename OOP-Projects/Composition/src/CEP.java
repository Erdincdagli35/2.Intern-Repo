
public class CEP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("HELLO\n");
		
		Resolution res = new Resolution(1920,1080);
		Screen scr = new Screen("VS197","ASUS","18.5",res);
		ComputerCase cc = new ComputerCase("Shadow Blade","Shadow","Glass");
		MotherBoard mBoard = new MotherBoard("B250-B","ASUS","Windows 10");
		
		PC pc = new PC(scr,cc,mBoard);
		
		pc.getComputerCase().openPC();
		pc.getScreen().closeScreen();
		pc.getAnacard().loadOS("Linux");
		
		System.out.print("\nBYE");
		
	}

}
