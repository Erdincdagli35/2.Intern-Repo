class bike extends vehicle {

	int wheel;
	bike(int wheel){
		this.wheel=wheel;
	}

	@Override
	public int getWheel(){
		return this.wheel;
	}
}
