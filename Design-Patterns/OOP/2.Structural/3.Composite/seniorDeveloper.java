public class seniorDeveloper extends developer{

	private String name,position;                                                          private int empId;

	public seniorDeveloper(int empId,String name,String position){                                       super(empId,name,position);                                                        }  


	@Override                                                                              public void showEDetails(){                                                                    System.out.println("ID : "+empID+"\nName : "+name+"\nPosition : Senior Developer");                               }  


}
