#include<iostream>
using namespace std;
class A{
	protected:
	int a,b;
	A(){
		cout<<"this is class A"<<endl;
	}
};
class B{
	public:
		void fun1(){
			cout<<"this is class B:"<<endl;
		}
};
class C:public A,public B{
	public:
		void fun2(){
			cout<<"enter the a:"<<endl;
			cin>>a;
			cout<<"the value A is"<<a<<endl;
			cout<<"the value B is"<<b<<endl;
		}
};
main(){
	C obj;
	obj.fun1();
	obj.fun2();
}
