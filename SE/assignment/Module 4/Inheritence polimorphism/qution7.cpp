//7. Write a C++ Program to illustrates the use of Constructors in multilevel
//inheritance.
#include<iostream>
using namespace std;

class A{
	
	public:
		
		A()				//constructor
		{
			cout<<"AAY HAAY "<<endl;		
		}
}; 

class B : public A{
	
	public:
		
		B()				//constructor
		{
			cout<<"OYE HOY"<<endl;
		}
};

class C : public B{
	
	public:
		
		C()				//constructor
		{
			cout<<"BADHO BATI BADHO BATI"<<endl;
		}
};

main()
{
	C ob;			//object creation
}
