package main;

public class Account {

	private String userName,password;
	private double balance;
	
	public Account(String userName, String password, double balance) {
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double depositeMoney(double money) {
		return balance+=money;
	} 
	public double withdrawMoney(double money) {
		if(balance<=0)
			return 0.0;
		else
			return balance-=money;
	}
	public String ToString() {
		return "\nUser Name : "+userName+
			   "\nBalance : "+balance+"\n";
	}
	public void print() {
		System.out.print(ToString());
	}
}
