//6. Write a C++ program to create a class called Person that has private
//member variables for name, age and country. Implement member
//functions to set and get the values of these variables.
#include<iostream>
using namespace std;
class person{
	private:
		string name;
		int age;
		string country;
		
		public:
			person(string n, int a, string c)
		{
			name=n;
			age=a;
			country=c;
		}
	    getinformation(){
	    	cout<<"your name is"<<name<<endl;
	    	cout<<"your age is"<<age<<endl;
	    	cout<<"your country is"<<country<<endl;
		}
};
main()
{
	person a("saloni",20,"india");
	a.getinformation();
}
