#include<iostream>
using namespace std;
class A{
	public:
		int sub(int a , int b){
			return a+b;
		}
};
class B{
	public:
		int sub(int a , int b){
			return a-b;
		}
};
main(){
	int a,b;
	cout<<"enter the A:"<<endl;
	cin>>a;
	cout<<"enter the B:"<<endl;
	cin>>b;
	C obj;
	int sum=obj.sum(a,b);
	int sub=obj.sub(a,b);
	cout<<"sum of a & b"<<endl;
	cout<<"sub of a & b"<<endl;
}
