//13. Write a program to find the max number from given two numbers using friend function 

#include<iostream>
using namespace std;
class Max_number{
	private :
			//data members
		int n1;
		int n2;
		public:
						
			Max_number(int a,int b):n1(a),n2(b){	//constructor
			}
					//Declare friend function
		friend void Maximum(Max_number);
			
};

		//friend function definition
void Maximum(Max_number m){
	if(m.n1>m.n2){
		cout<<"Max number is:"<<m.n1<<endl;
	}
	else{
		cout<<"Max number is:"<<m.n2<<endl;
	}
}
main(){
	int a,b;
	cout<<"Enter the first number:";
	cin>>a;
	cout<<"Enter the Second number:";
	cin>>b;
	Max_number mm(a,b);	//object creation
	Maximum(mm);		//call friend function
	
}
