#include<iostream>
using namespace std;
class A{
	public:
		void fun1(){
			cout<<"this is perent class:"<<endl;
		}
};
class B:public A{
	public:
		void fun2(){
			cout<<"this is child class:"<<endl;
		}
};
main(){
	B obj;
	obj.fun1();
	obj.fun2();
}
