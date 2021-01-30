class videoGame implements item{
	
	private int price;
	private String no;
	public videoGame(int cost,String no){this.price=cost;this.no=no;}
	public int getPrice(){return price;}
	public String getNo(){return no;}
	@Override
	public int accept(shoppingCart visitor){return visitor.visit(this);}
}
