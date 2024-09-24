#include<iostream>
using namespace std;
class father{
	protected:
		string surname="yadav";
};
class son1:father{
	string name="saloni";
	public:
	void show(){
		cout<<name<<" "<<surname<<endl;
	}
};
class son2:father{
	string name="neha";
	public:
	void disp(){
		cout<<name<<" "<<surname<<endl;
	}
};
main(){
	son1 s1;
	son2 s2;
	s1.show();
	s2.disp();
}
