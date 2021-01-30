class shoppingCartImpl implements shoppingCart{
	
	@Override
	public int visit(book b){
		int cost=0;
		if(b.getPrice()>50)
			cost=b.getPrice()-5;
		else
			cost=b.getPrice();
		System.out.println("Book \n"+
				   "No : "+b.getNo()+"\n"+
				   "Cost : "+b.getPrice()+"\n");
		return cost;
	}
	@Override
	public int visit(videoGame vg){
		int cost=vg.getPrice();
		System.out.println("Book \n"+                                                                               "No : "+vg.getNo()+"\n"+                                                                  "Cost : "+vg.getPrice()+"\n");
		return cost;	
	}
}
