#include<iostream>
using namespace std;

		//inline functions
inline int multiply(int a, int b) {
    return a * b;
}
inline int cubic(int a) {
    return a * a * a;
}

main() {
    int num1, num2
    		//user inputs
    cout << "Enter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;
    
     int product = multiply(num1, num2); // call inline function multiplication
    cout << "Multiplication of " << num1 << " and " << num2 << " is: " << product << endl;
    int num_cubic = 5;
    int cubic_value = cubic(num_cubic); // call inline function for cube
    cout << "Cubic of " << num_cubic << " is: " << cubic_value << endl;
}
