package main;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("HELLO\n");
		
		Scanner scanner = new Scanner(System.in);
		String options = "Options : "+
						"\n1.Prime Operations"+
						"\n2.Engineer Operations"+
						"\nPress 'q' for exit";
		System.out.println(options);
		while(true) {
			System.out.print("Pick Up the Option :");
			String option = scanner.nextLine();
			
			if(option.equals("q")) {
				System.out.print("Program has finished");
				break;
			}
			else if(option.equals("2")) {
				SoftwareEngineer se = new SoftwareEngineer("Erdinç","Daðlý",1,"C,C++,JAVA");
				String optionsForSE = "Options : "+
						"\n1.Get Imaj"+
						"\n2.Show Details"+
						"Press 'q' for exit";
				System.out.print(optionsForSE);
				while(true) {
					System.out.print("\nPick Up the Option :");
					optionsForSE = scanner.nextLine();
					
					if(optionsForSE.equals("q")) {
						System.out.print("Program has finished");
						break;
					}
					else if(optionsForSE.equals("1")) {
						System.out.print("Pick Up the OS :");
						String OS = scanner.nextLine();
						se.getImaj(OS);
					}
					else if(optionsForSE.equals("2")) {
						se.print();
					}
					else 
						System.out.println("WRONG CHOOSE for ENGINEER");
					}
			}
			
			else if(option.equals("1")) {
				Prime p = new Prime("Ufuk","Süngü",2,15);
				String optionsForP = "Options : "+
						"\n1.Make a Rise"+
						"\n2.Show Details"+
						"Press 'q' for exit";
				System.out.print(optionsForP);
				while(true) {
					System.out.print("\nPick Up the Option :");
					optionsForP = scanner.nextLine();
					
					if(optionsForP.equals("q")) {
						System.out.println("Program has finished");
						break;
					}
					else if(optionsForP.equals("1")) {
						System.out.print("Pick Up the Value :");
						int val = scanner.nextInt();
						p.makeARise(val);
					}
					else if(optionsForP.equals("2")) {
						p.print();
					}
					else 
						System.out.println("WRONG CHOOSE for PRIME");
					}
			}
						
			else
				System.out.print("IT'S WRONG CHOOSE");
		}
		
		System.out.print("\nBYE");
		
	}

}
