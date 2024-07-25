//1. WAP to create simple calculator using class.
#include<iostream>
using namespace std;
class calculater{

	public:
		
		float add(float a,float b)
		{
			return a+b;
		}
		float sum(float a,float b)
		{
			return a-b;
		}
		float mul(float a,float b)
		{
			return a*b;
		}
		float div(float a,float b)
		{
			return a/b;
		}
};
main()
{
	float a,b;
			cout<<"enter the first num:"<<endl;
			cin>> a;
			cout<<"enter the second num:"<<endl;
			cin>> b;
			
			calculater obj;
			float sum=obj.add( a, b);
			cout<<"Sum of the digit"<<sum<<endl;
	    
	
}
