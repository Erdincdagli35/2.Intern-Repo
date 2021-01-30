public class Main{
	
	public static void main(String [] args){
		ChatMediator m = new ChatMediatorImpl();
		User u1 = new UserImpl(m,"Erdinç");
		User u2 = new UserImpl(m,"Kağan");
		User u3 = new UserImpl(m,"Mustafa");

		m.addUser(u1);
		m.addUser(u2);
		m.addUser(u3);
		
		u1.send("Naber");
	}
}
