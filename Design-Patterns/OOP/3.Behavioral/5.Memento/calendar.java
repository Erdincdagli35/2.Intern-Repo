class calender{
	private String eventName,date,time;

	public void haveDate(String eventName,String date, String time){
		this.eventName=eventName;
		this.date=date;
		this.time=time;
		System.out.println("You have a date :) \n"+
				  "Event Title : "+eventName+"\n"+
				  "Event Date : "+date+"\n"+
				  "Event Time : "+time+"\n");

	}

	public Memento saveEventName(){
		
		System.out.println("Saved Name : ");
		return new Memento(eventName);
	}

	public void editFromMemento(Memento m ){
		eventName = m.getEventName();
		System.out.println("Event Name has edited "+ eventName);
	}
	
	
	public static class Memento{
		private final String eventName;

		public Memento(String name){eventName=name;}
		public String getEventName(){return eventName;}
	}


}
