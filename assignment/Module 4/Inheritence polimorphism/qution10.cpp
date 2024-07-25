//10.Write a program to concatenate the two strings using Operator Overloading


#include<iostream>
#include<string>
using namespace std;
class Concate{
	private:
		string n1;//private member 
	
		public :
			//assign the value to private member 
			void setdata(string a1){
				n1=a1;
				cout<<n1<<endl;
				
			}
			
			//function operator overloading 
		Concate	operator+(Concate s){
				Concate temp;
				temp.n1=n1+" "+s.n1;//concating the string 
				cout<<"After Concating the string:"<<temp.n1;
				cout<<endl;
			}
};
main(){
Concate c,c1,c2;//object of class
c.setdata("mahima");//function calling
c1.setdata("dabhi");
c2=c+c1;	
}
