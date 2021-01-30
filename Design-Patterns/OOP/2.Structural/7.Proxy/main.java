public class main{
	public static void main(String agrs[]){
		video v = new proxyVideo();
		v.display();
		
		video v2 = new realVideo();
		
	}
}
