class car extends vehicle{
	
	int wheel;
	car(int wheel){
		this.wheel=wheel;
	}

	@Override 
	public int getWheel(){
		return this.wheel;
	}
}
