//12.Write a programto swap the two numbers using friend function
//without using third variable
#include<iostream>
using namespace std;
class Swap{
	private://private data member
		int a;
		int b;
		public:
			
			// parametrize constructor 
			Swap(int n1,int n2):a(n1),b(n2){
			cout<<"Before the Swapping:"<<endl;
			cout<<"a:"<<a<<"\t";
			cout<<"b:"<<b<<endl;
			}
			friend void Frd_Swap(Swap);//frd function define
};


//frd function body
void Frd_Swap(Swap ss){
	
	//swapping logic
	
	ss.a=ss.a+ss.b;
	ss.b=ss.a-ss.b;
	ss.a=ss.a-ss.b;
	
	cout<<"After the swaping:"<<endl;
	cout<<"a:"<<ss.a<<"\t";
	cout<<"b:"<<ss.b<<endl;
}
main(){
	Swap s(23,45);
	Frd_Swap(s);//pass the object
}
