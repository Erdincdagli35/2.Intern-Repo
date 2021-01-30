public class developer implements employee{
	
	private String name,position;
	private int empId;
	
	public developer(int empId,String name,String position){
		this.empId=empId;
		this.name=name;
		this.position=position;
	}

	@Override
	public void showEDetails(){
		System.out.println("Employee Details\nID : "+empId+"\nName : "+name+"\nPosition : " + position);
	}
}
