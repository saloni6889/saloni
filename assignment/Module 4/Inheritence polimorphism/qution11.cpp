/*11. Write a program to calculate the area of circle, rectangle and triangle using Function Overloading 
Rectangle: Area * breadth 
Triangle: ½ Area breadth 
Circle: Pi * Area *Area */

#include<iostream>
#define pi 3.14
using namespace std;
class AreaOf{
	private:
			//data member
		double Area;
		public:
			
				//function overloading
			void area( int a){
				cout<<"Area of circule:"<<pi*a*a<<endl<<endl;
				cout<<"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"<<endl;
			}
			void area(float l,float w){
				cout<<"Area of Rectangle:"<<l*w<<endl<<endl;
					cout<<"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"<<endl;
			}
			void area(){
				float b=2.45,h=3.66;
				cout<<"Area of Triangle:"<<((((float)1/2)*b)*h)<<endl;
				}
	
};
main(){
	int a;
	cout<<"Enter the Radius:";
	cin>>a;		//user input
	AreaOf aa;	//object creation
	aa.area(a);		//call member function
	float l,w;
			//user input
	cout<<"Enter the Length for Rectangle:";
	cin>>l;
	cout<<"Enter the width for Rectangle:";
	cin>>w;
	
				//call member functions 
	aa.area(l,w);
	aa.area();
}
