//4. Write a C++ program to implement a class called Circle that has private
//member variables for radius. Include member functions to calculate the
//circle's area and circumference.
#include<iostream>
using namespace std;
class circle{
	private:
	double radius;
	
	public:
		 circle(double r) {
        radius = r;
    }
   void setradius (double r){
    	radius = r;
	}
	getradius(){
	    return radius;
	}
	double calculate(){
	    return 3.14*radius*radius;
	}
	double calculateCircumference(){
	    return 2*3.14*radius;	
	}
};
main()
{
	circle mycircle(3.0);
    cout << "Area of the circle with radius "<<mycircle.getradius() << " is: " << mycircle.calculate() << endl;
    cout << "Circumference of the circle with radius " << mycircle.getradius() << " is: " << mycircle.calculateCircumference() << endl;
}

