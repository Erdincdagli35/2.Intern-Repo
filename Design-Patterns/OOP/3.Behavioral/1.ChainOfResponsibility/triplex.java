public class triplex extends house{
	
	public triplex(String address,String city){super(address,city);System.out.print("TRIPLEX: \n");}
	@Override                                                                                public cleaning getFirstDuty(String str){
	if(str== "IN")
		return cleanIN.firstDuty();
	else if(str=="OUT")
		return cleanOUT.firstDuty();
	else if(str=="INOUT")
		return cleanInOut.firstDuty();
	else
		return null;
	
	}
}
