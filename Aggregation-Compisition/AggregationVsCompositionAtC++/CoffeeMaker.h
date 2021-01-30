#include <iostream>
#include "Milk.h"
#include "Sugar.h"

using namespace std;

class CoffeeMaker{
	
	private : string name;
		  Coffee coffee;//Compisition
		  Milk*milk;//Agg
		  Sugar*sugar;//Agg
	public : 
		  CoffeeMaker(string name,Coffee coffee,Milk*milk,Sugar*sugar)
			  :name(name),coffee(coffee){
		  	
			  this->name=name;
			  this->coffee=coffee;
			  this->sugar=sugar;
			  this->milk=milk;
			  cout<<"Dark Coffee has Created";

		  }

		  void printIt(){
		  	cout<<"\n\nName : "<<name<<"\nCoffee : "<<coffee.name<<"\nMilk : "<<milk->state<<"\nSugar : "<<sugar->state;
		  }
		  string getCoffeType(){
		  	if(coffee.name=="" && milk->state==false && sugar->state==false)
				return "It's not Coffee Bro :) ";
			else if(coffee.name!="" && milk->state==false && sugar->state==false)
				return "Your Coffee : Espresso";
			else if (coffee.name!="" && milk->state==true && sugar->state==false)
				return "Your Coffee : Capuccino";
			else if (coffee.name!="" && milk->state==true && sugar->state==true)
				return "Your Coffee : Latte";
			return "NOTHINNOTHINGG";
		  }
	
};
