#include<iostream>  
#include "Coffee.h"
#include "CoffeeMaker.h"

using namespace std; 

int main() 
{ 

	cout<<"Hello World"<<endl; 
	
	Coffee cof("Lavazza");
	Milk milk=Milk(false);
	Sugar sug=Sugar(false);

	CoffeeMaker cm("Arçelik Coffee Machine",cof,&milk,&sug);
	
	Milk milk2=Milk(true);
	Sugar sug2=Sugar(true);
	CoffeeMaker cm2("Big Coffee Machine",cof,&milk2,&sug2);

		
	cm.printIt();	
	cout<<"\n"<<cm.getCoffeType();
	cm2.printIt();
	cout<<"\n"<<cm2.getCoffeType();
        
	
	cout<<"\n\nBye World"<<endl;	
        return 0; 
} 
