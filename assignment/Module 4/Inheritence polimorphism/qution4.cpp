//4. Write a C++ Program display Student Mark sheet using Multiple inheritance
#include<iostream>
using namespace std;
class info{
	private:
		string sch;
		string name;
		string std;
		int age;
		public:
			setdata(){
				sch="Rastra bharti school";
				name="Saloni";
				std="12";
				age=20;
			}
			getdata(){
			cout<<"\t"<<sch<<"\n";
			cout<<"******************";
			cout<<"name:"<<std<<"\t";
			cout<<"standard:"<<std<<"\t";
			cout<<"age:"<<age<<"\t"<<endl;
			cout<<"\n";	
			}
};
class marks{
	private:
		int math;
		int sci;
		int eng;
		int total;
		double percentange;
		public:
		void setmarks(){
				math=80;
				sci=75;
				eng=90;
			}
		void	getmarks(){
				cout<<"SR No"<<"\t"<<"subject\t"<<"marks"<<endl;
				cout<<1.<<"\t"<<"maths\t"<<math<<endl;
				cout<<2.<<"\t"<<"science\t"<<sci<<endl;
				cout<<3.<<"\t"<<"english\t"<<eng<<endl;
				cout<<"\n";
				total=math+sci+eng;
				percentange=(double)total/3;
				cout<<"total(300):"<<total<<"\t";
				cout<<"\tpercentage:"<<percentange<<endl;
			}
};
class marksheet: public marks,public info{
       public:
       result(){
	   setdata();
	   getdata();
	   setmarks();
	   getmarks();
    }
};
main()
{
	marksheet a;
	a.result();
}
