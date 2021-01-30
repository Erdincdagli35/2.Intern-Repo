public class realVideo implements video{
	public String name;

	public realVideo(){
		System.out.println("Real Video Constructor");
		display();
		loadFromDisk();
	}	
	public void display(){System.out.println("Real Video Class has displayed");}
	public void loadFromDisk(){System.out.println("Real Video has loaded");}
		

}
