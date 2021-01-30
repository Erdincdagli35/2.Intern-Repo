#include <iostream>  
  
class Milk {
	public :
		bool state=false;

		Milk(bool state){
			this->state=state;
		}
		
		bool getState(){
			return state;
		}
		void setState(bool stat){
			this->state=stat;
		}

	
};
