//3. Create a class person having members name and age. Derive a class student
//having member percentage. Derive another class teacher having member
//salary. Write necessary member function to initialize, read and write data.
//Write also Main function (Multiple Inheritance).
#include<iostream>
using namespace std;
class person{
	private:
		string name;
		int age;
		public:
			 setperson(string n, int a){
			  name=n;
			  age=a;
		    }
		    displayperson(){
		      cout<<"name:"<<name<<endl;
		      cout<<"age:"<<age<<endl;
		    }
};
class student:person{
	private:
		float percentage;
		public:
		setstudent(string n, int a, float p){
			percentage=p;
	    	setperson(n,a);
		}
		displaystudent(){
			cout<<"student details are:";
			displayperson();
			cout<<"percentage is :"<<percentage<<endl;
		}
};
class teacher:person{
	private:
		float salary;
		public:
		seteacher(string n, int a, float s){
			salary=s;
			setperson(n,a);
		}
		displayteacher(){
			cout<<"teacher detail are:";
			displayperson();
			cout<<"salary is:"<<salary<<endl;
		}
};
main(){
	student s;
	s.setstudent("Saloni", 20,80);
	s.displaystudent();
	teacher t;
	t.seteacher("Mahima", 21, 9000.98);
	t.displayteacher();
}

