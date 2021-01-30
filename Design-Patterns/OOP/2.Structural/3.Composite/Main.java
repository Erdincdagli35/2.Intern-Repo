public class Main{
	public static void main(String[] args){
		
		companyDirector cd = new companyDirector();  
		cd.showEDetails();

		developer d1 =new developer(1,"Ali Yazmacı","JD");
		developer d2 =new developer(2,"Emre Aksoy","JD");
		developer d3 =new developer(3,"Uğur Murtaza","SD");
		developer d4 =new developer(4,"Erdinç Dağlı","I");
		
		cd.addEmployee(d1);
		cd.addEmployee(d2);
		cd.addEmployee(d3);
		cd.addEmployee(d4);
	
		cd.showEDetails();

		juniorDeveloper d5 =new juniorDeveloper(5,"İlker Yasin Aksoy","JD");
		cd.addEmployee(d5);

		//cd.showEDetails(); 

	}
}
