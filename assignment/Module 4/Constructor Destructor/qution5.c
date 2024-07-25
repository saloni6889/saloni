//5. Write a C++ program to create a class called Triangle that has private
//member variables for the lengths of its three sides. Implement member
//functions to determine if the triangle is equilateral, isosceles, or scalene.
#include<iostream>
using namespace std;

class Triangle {
private:
    double side1, side2, side3;

public:
    // Constructor
    Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    bool isEquilateral() const {
        return (side1 == side2 && side2 == side3 && side3==side 1);
    }
    bool isIsosceles() const {
        return (side1 == side2 || side1 == side3 || side2 == side3);
    }
    bool isScalene() const {
        return (side1 != side2 && side1 != side3 && side2 != side3);
    }
};
main()
{
Triangle t(23,35,56);
	
}
