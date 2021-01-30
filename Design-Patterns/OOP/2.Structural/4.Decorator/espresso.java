class espresso extends coffee{
	
	public espresso(){description= "Espresso Beans"; name="Espresso";}
	public int getCost(){return 15;}
	public String toString(){return "Name : "+getName()+
			              "\nDescription : "+getDescription()+
				      "\nPrice : "+getCost();}
	public void toPrint(){System.out.println(toString());}

	
}
