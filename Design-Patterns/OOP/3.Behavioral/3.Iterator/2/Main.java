public class Main{
	public static void main(String [] args){
		NameRepo name = new NameRepo();

		for (Iterator i = name.getIterator();i.hasNext();)
		{
			String n = (String) i.next();
			System.out.println("Name : "+n);
		}
	}
}
