//1. WAP to create simple calculator using class.
#include<iostream>
using namespace std;
class calculater{

	public:
		
		float add(float a,float b)  //function for addition
		{
			return a+b;
		}
		float sum(float a,float b) //function for subtraction
		{
			return a-b;
		}
		float mul(float a,float b)	//function for multipliction
		{
			return a*b;
		}
		float div(float a,float b) //function for division
		{
			return a/b;
		}
};
main()
{
	float a,b;
								//user input
			cout<<"enter the first num:"<<endl;
			cin>> a;
			cout<<"enter the second num:"<<endl;
			cin>> b;
			
			calculater obj;  // object  creation
			float sum=obj.add( a, b);   //calling member function 
			cout<<"Sum of the digit"<<sum<<endl;
	    
	
}
