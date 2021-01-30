class main{
	public static void main(String [] args){
		
		SimpleRemoteControl r = new SimpleRemoteControl();

		Light l = new Light();
		Stereo s = new Stereo();

		r.setCommand(new LightOnCommand(l));
		r.buttonWasPressed();

		r.setCommand(new StereoOnWithCDCommand(s));
		r.buttonWasPressed();

		r.setCommand(new StereoOffCommand(s));
		r.buttonWasPressed();


	}
}
