//2. Write a C++ Program to find Area of Rectangle using inheritance.
#include<iostream>
using namespace std;
class shap{

		
	
	public:
		float width;
		float lenght;
		
	inputdata(float i,float w)
	{
	width=w;
	lenght=i;
	}
	getdata()
	{
cout<<width<<endl;
cout<<lenght<<endl;
	}
};

class Rectangle : public shap{
	
	public:
		getdata();
		area()
		{
			cout<<"area of Rectangle : "<<lenght*width;
		}
};

main()
{
	Rectangle obj;
	obj.inputdata(23,45);
	obj.area();
}
