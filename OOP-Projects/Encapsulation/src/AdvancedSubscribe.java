public class AdvancedSubscribe {
	
	private String name,city;
	private int balance=120;
	public AdvancedSubscribe(String name, String city, int balance) {
		
		this.name = name;
		if(balance>=0 && balance<=120)
			this.balance = balance;
		this.city = city;
	}
	
	public void useNaturalGas(int number) {
		if((this.balance-number)<0)
			System.out.println("You dont have enough balance");
		else {
			this.balance-=number;
			
			if((this.balance)<=0)
				System.out.println("Balance is done");
			else
				System.out.println("New Balance : "+balance);
		}
		
	}
	public String toString() {
		return "Balance : "+balance;
	}
	public void print() {
		System.out.println(toString());
	}
	
}
