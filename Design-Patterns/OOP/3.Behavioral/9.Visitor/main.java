class main{
	public static void main(String[] args ){
		item[] i = new item[]{new book (11,"1111"),
				      new videoGame(12000,"12")};

		int total = addPrice(i);
		System.out.println("Total : "+total);
	}
	private static int addPrice(item[] i ){
		shoppingCart v = new shoppingCartImpl();
		int sum=0;
		for(item it:i)
			sum=sum+it.accept(v);
		return sum;
	}
}
