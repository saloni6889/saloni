//2. Write a program of Addition, Subtraction, Division, Multiplication using
//constructor.
#include<iostream>
using namespace std;
class Hello{
	public:
		Hello()
		{
			cout<<"welcome to our website"<<endl;
		}
		int a,b;
		fun1()
		{
			cout<<"enter the num a"<<endl;
			cin>>a;
			cout<<"enter the num b"<<endl;
			cin>>b;
			
			cout<<"Addition"<<a+b<<endl;
		}
		fun2()
		{
			cout<<"enter the num a"<<endl;
			cin>>a;
			cout<<"enter the num b"<<endl;
			cin>>b;
			
			cout<<"Subtraction"<<a-b<<endl;
		}
		fun3()
		{
			cout<<"enter the num a"<<endl;
			cin>>a;
			cout<<"enter the num b"<<endl;
			cin>>b;
			
			cout<<"Division"<<a/b<<endl;
		}
		fun4()
		{
			cout<<"enter the num a"<<endl;
			cin>>a;
			cout<<"enter the num b"<<endl;
			cin>>b;
			
			cout<<"Multiplication"<<a*b<<endl;
		}
		~Hello()
		{
			cout<<"welcome to our website"<<endl;
		}
};
main()
{
	class Hello obj;
	obj.fun1();
	obj.fun2();
	obj.fun3();
	obj.fun4();
}

