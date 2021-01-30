public class main{
	
	public static void main(String args[]){
		house flat = new flat("Atatürk Mah. 84.Sokak No:7","İzmir/Foça");
		flat.getFirstDuty("IN").start(flat);

		house triplex = new triplex("Atatürk Mah 17.Sokak No:1","İzmir/Foça");
		triplex.getFirstDuty("OUT").start(triplex);
		
	        house dublex = new dublex("Ali Baba Mah. 11.Sokak No:2","İstanbul/Kadıköy");
		dublex.getFirstDuty("INOUT").start(dublex);
		

	}
}
