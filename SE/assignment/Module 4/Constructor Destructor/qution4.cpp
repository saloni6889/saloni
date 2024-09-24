//4. Write a C++ program to implement a class called Bank Account that has
//private member variables for account number and balance. Include
//member functions to deposit and withdraw money from the account. 
#include<iostream>
using namespace std;

class Bank
{
	public:
	//Data Members
	string name;			//Name of the depositor 
	string accountno;			//Account Number 
	string account_type;	//Type of Account 
	float balance;			//Balance amount in the account
	
	
	//Data Functions
	values()				//To assign values 
	{
		cout<<"**   Enter your details   **"<<endl;
		cout<<"Enter Depositor's Name : ";
		getline(cin,name);
		cout<<"Enter Account Number   : ";
		cin>>accountno;
		cout<<"Enter Account Type     : ";
		cin>>account_type;
		cout<<"Enter Account Balance  : Rs.";
		cin>>balance; 		
	}	
	
	deposit()				//To deposited an amount 
	{
		float depo;
		cout<<endl<<"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"<<endl;
		cout<<"Enter deposit amount   : Rs.";
		cin>>depo;
		balance += depo;	
		cout<<"After Deposit : "<<endl<<"Current balance : Rs."<<balance<<endl;
	}	
	
	withdraw()				//To withdraw an amount after checking balance 
	{
		float with;
		cout<<endl<<"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"<<endl;
		cout<<"Enter Withdeaw amount  : Rs.";
		cin>>with;
		if(with<=balance)	//check balance available or not.
		{
			balance -= with;
			cout<<"After withdraw : "<<endl<<"Current balance : Rs."<<balance<<endl;
		}
		else
		{
			cout<<"you doesn't have enough balance in"<<endl<<"your account"<<endl; 
			cout<<"so you Cannot Withdraw Amount";
			cout<<endl<<"Current balance : Rs."<<balance<<endl;
		}
	}
	
	display()			//To display name and balance 
	{
		cout<<endl<<"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"<<endl;
		cout<<"Account Holder's Name  : "<<name<<endl;
		cout<<"Account Number         : "<<accountno<<endl;
		cout<<"Account Type           : "<<account_type<<endl;
		cout<<"Account Balance        : Rs."<<balance;
		cout<<endl<<"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"<<endl;
	}
};

main()
{
	Bank ac; 		//create object 
	
		//call all member functions.
	ac.values();		
	ac.deposit();
	ac.withdraw();
	ac.display();
}
