//3. Write a C++ program to create a class called Car that has private
//member variables for company, model, and year. Implement member
//functions to get and set these variables.
#include<iostream>
#include<string>
using namespace std;
class car{
	private:
				//data members
		string company;
		string model;
		int year;
		
		public:
		car(string c,string m, int y)  //constructor
		{
			company=c;
			model=m;
			year=y;
		}
				//get methods
		string getcompany()
		{
			return company;
		}
		string getmodel()
		{
			return model;
		}
		int getyear()
		{
			return year;
		}
};
int main() {
    car myCar("Toyota", "Camry", 2023); //object creation
    cout << "Initial values of the car:" << endl;
    			//call get methods
    cout << "Company: " << myCar.getcompany() << endl;
    cout << "Model: " << myCar.getmodel() << endl;
    cout << "Year: " << myCar.getyear() << endl;
    return 0;
}
