#include<iostream>
using namespace std;
class orders{                 //create class
	public:       
	
	// fun for pizza
	
		void Pizz(){           
			int choice;      //data member
			
			//menue
			
			cout<<"1-club Pizaa RS.220"<<endl;
			cout<<"2-Veg.crispy Pizza RS.140"<<endl;
			cout<<"3-Extream vrg.Pizza RS.120"<<endl;
			cout<<"Enter the choice:";
			cin>>choice;            //user input
			
			//enter your choice
		
			if(choice==1){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=220*quantity;                 //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
			else if(choice==2){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=140*quantity;         //your bill amount
				
				
				cout<<"Your Bill:"<<total<<endl;
				
			}
			else if(choice==3){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=120*quantity;                    //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
	   }
	   
	   
	   //fun for Burgur
	   
		void Burgur(){              
		int choice;                            //data member
		
		// menue 
		
		    cout<<"1-club Burgur RS.70"<<endl;
			cout<<"2-Veg.crispy Burgur RS.40"<<endl;
			cout<<"3-Extream vrg.Burgur RS.50"<<endl;
			cin>>choice;
			if(choice==1){                 //user input
				
				//enter your choice
				
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=70*quantity;                    //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
			else if(choice==2){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=40*quantity;                    //your bill amount
				cout<<"Your Bill:"<<total<<endl;        
				
			}
			else if(choice==3){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=50*quantity;                      //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
		}
		
		//fun for Sandwich
		
		void Sandwich(){ 
		int choice;                    //data member
		
		// menue
		
		    cout<<"club Sandwich RS.80"<<endl;
			cout<<"Veg.crispy Sandwich RS.50"<<endl;
			cout<<"Extream vrg.Sandwich RS.90"<<endl;
			cin>>choice;
			if(choice==1){                                //user input
			
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=80*quantity;                //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
			else if(choice==2){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=50*quantity;                        //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
				
			}
			else if(choice==3){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=90*quantity;                      //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
		}
		
		
		//fun for roll
		
		void Roll(){ 
		int choice;              //data member
		
		// menue
		
		    cout<<"club Roll RS.100"<<endl;
			cout<<"Veg.crispy Roll RS.80"<<endl;
			cout<<"Extream vrg.Roll RS.100"<<endl;
			cin>>choice;
			if(choice==1){                          //user input
			
				//enter your choice
				
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=100*quantity;                    //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
			else if(choice==2){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=80*quantity;                         //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
				
			}
			else if(choice==3){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=100*quantity;                         //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
		}
	
	//fun for briyani
	
		void Biryani(){ 
		int choice;                         //data member
		
		// menue
		
		    cout<<"club Biryani RS.30"<<endl;
			cout<<"Veg.crispy Biryani RS.60"<<endl;
			cout<<"Extream vrg.Biryani RS.90"<<endl;
			cin>>choice;
			if(choice==1){                            //user input
			
				//enter your choice
				
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=30*quantity;                      //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
			else if(choice==2){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=60*quantity;                     //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
				
			}
			else if(choice==3){
				int quantity;int total;
				cout<<"enter the quantity:";
				cin>>quantity;
				total=90*quantity;                        //your bill amount
				
				cout<<"Your Bill:"<<total<<endl;
			}
		}
		
		void greeting(){
			cout<<"Your order is deliver in 40 min"<<endl;
			cout<<"Thank you ordering from saloni hotel :)"<<endl;
			
		}
		
};
main()
{
	char order;                  //data member
	
  string name;
  cout<<"Please enter your name:";                  //user input
  
 getline(cin,name);
  cout<<"Hello "<<name<<endl<<endl;
  
  
  //do while for if you want more orde
  
  do{
  
  cout<<"What would you like the order?"<<endl<<endl;
  cout<<"\t\t\t\t\t\t....Menu...."<<endl;
  cout<<"1)PIZZ"<<endl;
  cout<<"2)BURGER"<<endl;
  cout<<"3)SANDWICH"<<endl;
  cout<<"4)ROLL"<<endl;
  cout<<"5)BIRYANI"<<endl;
  
  int choice;             //user input
  
  cout<<"Plaese enter your choice(1-pizza,2-burger..):";
  cin>>choice;
  
  //ifelse 1-pizza, 2- burgur, .....
  
  	if(choice==1){
  		orders o;
  		o.Pizz();
  		o.greeting();
  		
  	
  }
  else if(choice==2){
  		orders o;
  		o.Burgur();
  		o.greeting();}
  	else if(choice==3){
  		orders o;
  		o.Burgur();
  		o.greeting();}
else if(choice==4){
  		orders o;
  		o.Roll();
  		o.greeting();
}
else if(choice==5){
  		orders o;
  		o.Biryani();
  		o.greeting();
		  
		  
}
  cout<<"Do you want more order y/n"<<endl;
  cin>>order;                                    //n for no more choice & y for more choice
                                                  
  }while(order!='n');
  
  
}
