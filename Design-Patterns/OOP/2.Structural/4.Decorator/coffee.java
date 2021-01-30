abstract class coffee{
	
	String name="-- Coffee --" ,description = " -- ------ --";

	public String getName(){return name;}
	public String getDescription(){return description;}
	
	public abstract int getCost();
	/*
	public abstract String toString();
	public abstract void toPrint();
	*/
	public String toString(){return "Name : "+getName()+                                                                 "\nDescription : "+getDescription()+                                                     "\nPrice : "+getCost()+"\n"+
				   "-----------------------\n";}                                     public void toPrint(){System.out.println(toString());} 
}
