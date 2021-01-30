public class phone extends electronicTool{

	public phone(color clr){ super(clr);}

	@Override
	public String create(){
		return "Phone created. \nColor: "+clr.fill();
	}
}
