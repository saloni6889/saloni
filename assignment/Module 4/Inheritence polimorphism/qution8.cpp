//8. Write a program to Mathematic operation like Addition, Subtraction,
//Multiplication, Division Of two number using different parameters and
//Function Overloading.
#include<iostream>
using namespace std;
		//function overloading 
 add(int a, int b){
 	cout<<"Addition"<<a+b<<endl;
 }
 add(float a, int b){
 	cout<<"subtraction"<<a-b<<endl;
 }
 add(int a, float b){
 	cout<<"Multiplication"<<a*b<<endl;
 }
 add(float a, float b){
 	cout<<"Division"<<a/b<<endl;
 }
 
 main()
 {
 		//function call
 	add(12,45);
 	add(2,33);
 	add(12,2);
 	add(15,18);
 }
