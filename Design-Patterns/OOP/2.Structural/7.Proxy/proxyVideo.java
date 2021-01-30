public class proxyVideo implements video{
	
	realVideo realvideo;
	String name;

	public proxyVideo(){System.out.println("Proxy Video Constructor");}
	public void display(){System.out.println("Proxy Video has displayed");}
}
