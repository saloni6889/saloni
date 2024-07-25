//6. Write a C++ program to implement a class called Employee that has
//private member variables for name, employee ID, and salary. Include
//member functions to calculate and set salary based on employee
//performance. Using of constructor.
#include<iostream>
#include<string>
using namespace std;
class employee{
	private:
			string name;
			int employeeid;
			double salary;
		public:
			
				employee(string empname, int empid)
				{
				name= empname;
				employeeid= empid;
				salary=0.0;
			}
			void setsalary(double basesalary, double performance)
			{
			salary= basesalary * perfomance;
		}
			void displayInfo() {
        cout << "Employee ID: " << employeeID << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: $" << salary << endl;
    }

};
main()
{
	employee emp("saloni", 1001);
    emp.setSalary(3000, 1.2);
    emp.displayInfo();
}
