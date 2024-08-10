//3. Create a class person having members name and age. Derive a class student
//having member percentage. Derive another class teacher having member
//salary. Write necessary member function to initialize, read and write data.
//Write also Main function (Multiple Inheritance).
#include<iostream>
using namespace std;
class person{
	private:
		 	//data members
		string name;
		int age;
		
		public:
				//set method
			 setperson(string n, int a){
			  name=n;
			  age=a;
		    }
		    
		    		//display data
		    displayperson(){
		      cout<<"name:"<<name<<endl;
		      cout<<"age:"<<age<<endl;
		    }
};
class student:person{
	private:
				//data member
		float percentage;
		
		public:
				//set method
		setstudent(string n, int a, float p){
			percentage=p;
	    	setperson(n,a);
		}
				//display data 
		displaystudent(){
			cout<<"student details are:";
			displayperson();
			cout<<"percentage is :"<<percentage<<endl;
		}
};
class teacher:person{
	private:
			//data member
		float salary;
		public:
				//set method
		seteacher(string n, int a, float s){
			salary=s;
			setperson(n,a);
		}
					//display data
		displayteacher(){
			cout<<"teacher detail are:";
			displayperson();
			cout<<"salary is:"<<salary<<endl;
		}
};

main(){
	student s;			//creation object  of student class
			//call member functions
	s.setstudent("Saloni", 20,80);
	s.displaystudent();
	teacher t;			//creation object of teacher class
			//call member functions
	t.seteacher("Mahima", 21, 9000.98);
	t.displayteacher();
}

