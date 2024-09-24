//6. Write a C++ Program to show access to Private Public and Protected using
//Inheritance.
#include<iostream>
using namespace std;
class check{
			//data members
	private:int p1=30;
	protected:int p2=90;
	public:int p3=40;
		//get method
	int getdata(){
		return p2;
	}
		//get method
	int getdata1(){
		return p1;
	}
};
class numb:public check{
	public:
			//member function for display data
		void display(){
			cout<<"private data member p1:"<<getdata1()<<endl;
			cout<<"protected data member p2:"<<getdata()<<endl;
			cout<<"public data member p3:"<< p3 <<endl;
		}
};

main(){
	numb g;				//object creation
				//call member functions show the data members
	cout<<"this is private data member p1:"<<g.getdata()<<endl;
	cout<<"this is protected data member p2:"<<g.getdata()<<endl;
	cout<<"this is public data member p3:"<<g.getdata()<<endl;
	g.display();	
	
}
