#include<iostream>
using namespace std;
class vehicle{
	public:
		vehicle(){
			cout<<"this is a vehicle:"<<endl;
		}
};
class car:public vehicle{
	public:
		car(){
			cout<<"this is a car"<<endl;
		}
};
class racling{
	public:
		racling(){
			cout<<"this is for racling:"<<endl;
		}
};
class ferrari:public car,public racling{
	public:
		ferrari(){
			cout<<"ferrari is a racling car"<<endl;
		}
};
main(){
	ferrari();
}
