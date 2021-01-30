class SimpleRemoteControl{
	
	Command slot;

	public SimpleRemoteControl(){
		System.out.println("\n\n---\nIt's Loading...\n");

	}
	public void setCommand(Command command){slot = command;}
	public void buttonWasPressed(){slot.execute();}
}
