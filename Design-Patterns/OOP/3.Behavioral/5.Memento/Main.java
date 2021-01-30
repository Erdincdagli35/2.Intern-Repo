import java.util.List;
import java.util.ArrayList;

class Main{
	
	public static void main(String args [])
	{	
		List <calender.Memento> myList = new ArrayList<calender.Memento>();
		
		calender c = new calender();

		c.haveDate("First Date","11.08.2020","18.30");
		myList.add(c.saveEventName());
		c.haveDate("Second Date","14.08.2020","17.30");                                          myList.add(c.saveEventName());

		c.editFromMemento(myList.get(0));
		c.editFromMemento(myList.get(1));
	}
	
}
