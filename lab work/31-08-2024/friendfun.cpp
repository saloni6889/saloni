#include<iostream>
using namespace std;
class kajal;
class ankita{
	private:
		int money = 10;
		friend void saloni (kajal , ankita);
};
class kajal{
	private:
		int money = 20;
		friend void saloni(kajal, ankita);
};
void saloni(kajal s1 , ankita s2){
	cout<<"sum"<<s1.money+s2.money<<endl;
}
main(){
	kajal obj1;
	ankita obj2;
	saloni(obj1,obj2);
}
