public class Piano implements Instrument{
	
	public String getName(){return "Piano";}
	public String getColor(){return "Black";}
	public float getPrice(){return 12.000f;}
	
	public String toString(){
		return "Insturment : \n"+
		       "Name : "+getName()+"\n"+
		       "Color : "+getColor()+"\n"+
		       "Price : "+getPrice()+"\n";
	} 
	public void toPrint(){System.out.println(toString());}
}
