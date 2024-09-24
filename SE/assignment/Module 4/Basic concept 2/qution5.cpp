//5. Write a C++ program to create a class called Rectangle that has private
//member variables for length and width. Implement member functions to
//calculate the rectangle's area and perimeter.
#include<iostream>
using namespace std;
class ractangle{
	private:
	double length,width;
	public :
		ractangle(double length, double w){
			length=l;
			width=w;
		}
	double calculatearea(){
	    return length*width;
	}
	double calculateperimeter(){
	    return 2*length*width;	
	}
};

main()
{
	ractangle mycalculate(3,4);  //object creation
    cout << "Area of the circle with ractangle "<< mycalculate.calculatearea() << endl; //call member function area of rectangle
    cout << "perimeter of the circle with ractangle "<< mycalculate.calculateperimeter() << endl; //call member function perimeter of rectangle
}

