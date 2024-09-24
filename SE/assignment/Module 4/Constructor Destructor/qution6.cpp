//6. Write a C++ program to implement a class called Employee that has
//private member variables for name, employee ID, and salary. Include
//member functions to calculate and set salary based on employee
//performance. Using of constructor.
#include<iostream>
#include<string>
using namespace std;
class employee{
	private:
			//data member
			string name;
			int employeeid;
			double salary;
		public:
			
				employee(string empname, int empid) //constructor
				{
				name= empname;
				employeeid= empid;
				salary=0.0;
			}
			
					//count salary
			void setsalary(double basesalary, double performance)
			{
			salary= basesalary * perfomance;
		}
					//function for display data
			void displayInfo() {
        cout << "Employee ID: " << employeeID << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: $" << salary << endl;
    }

};
main()
{
	employee emp("saloni", 1001);		//object creation
			//call member functions
    emp.setSalary(3000, 1.2);		
    emp.displayInfo();
}
