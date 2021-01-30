/**
 * 
 */
package main;

/**
 * @author Erdinc
 *
 */
public class ATMDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("HELLO\n");
		
		ATM atm = new ATM();
		Account ED = new Account("ErdincDagli","1996",200.45);
		atm.init(ED);
		
		System.out.print("\nBYE");
	}

}
