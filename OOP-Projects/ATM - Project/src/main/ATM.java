package main;
import java.util.Scanner;

public class ATM {
	
	public void init(Account account) {
		
		Login log = new Login();
		
		System.out.println("Welcome the ED BANK");
		System.out.println("PLease Sign In");
		
		int count=3;
		while(true) {
			if(log.login(account)==true) {
				System.out.println("Correctly Sign In");
			    break;
			}
			else {
				System.out.println("It's wrong sign in\nPlease try again");
				count--;
			}
			if(count==0) {
				System.out.println("There's not any right to enter");
				return;
		
			}
		
	
		}
		
		Scanner scnr = new Scanner(System.in);
		String options ="\n1.Show the Balance"+
						 "\n2.Deposite the Money"+
						 "\n3.Withdraw the Money"+
						 "\nPress e for Exit";

		System.out.println(options); 
		while(true) {
			System.out.print("\nSelect the Option : ");
			String option = scnr.nextLine();
			
			if(option.equals("q"))
				break;
			
			else if(option.equals("1"))
				System.out.print("\nBalance : "+account.getBalance());
			else if(option.equals("2")) {
				System.out.print("\nEnter the money for deposite : ");double money = scnr.nextDouble();
				account.depositeMoney(money);
				account.print();	
			}
			else if(option.equals("3")) {
				System.out.print("\nEnter the money for withdraw : ");double money = scnr.nextDouble();
				account.withdrawMoney(money);
				account.print();	
			}
			else
				System.out.print("IT'S WRONG OPTION");
				
			
		}
	}
	

}
