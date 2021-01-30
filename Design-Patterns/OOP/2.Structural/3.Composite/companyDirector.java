import java.util.ArrayList;
import java.util.List;

public class companyDirector implements employee{                                                                                                                                     private List<employee> eList = new ArrayList<employee>();

	@Override
	public void showEDetails(){
		for(employee emp:eList )
			emp.showEDetails();
	}
	public void addEmployee(employee emp){
		eList.add(emp);
	}
	public void removeEmployee(employee emp ){
		eList.remove(emp);}
}
