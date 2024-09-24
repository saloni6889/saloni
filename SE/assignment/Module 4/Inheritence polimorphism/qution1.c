//1. Assume a class cricketer is declared. Declare a derived class batsman from
//cricketer. Data member of batsman. Total runs, Average runs and best
//performance. Member functions input data, calculate average runs, Display
//data. (Single Inheritance)
#include<iostream>
#include<string>
using namespace std;
class cricketer{
	protected:
		string name;
		int age;
		public:
			void set data (){
				cout<<"enter the name:"
				cin>>name;
				cout<<"age is:"
				cin>>agge;
			}
			void get data(){
				cout<<"name is :"<<name<<endl;
				cout<<"age is :"<<age<<endl;
			}
			class batsman:public cricketer{
				private:
					int total_run;
					int total_match;
					int avg_run;
					int best_performance;
					public:
						void setbatsmandata(){
							cout<<"enter the total run:";
							cin>>total_run;
							total_match=10;
							avg_run=ttotal_run/ total_match;
						}
						void getbatsmandata(){
							cout<<"*****************************"<<endl;
							getdata();
							cout<<"total run:"<<total_run<<endl;
							cout<<"total match:"<<total_match<<endl;
							cout<<"avg run:"<<avg_run<<endl;
							cout<<"best performance:"<<best_performance<<endl;
						}
			};
			main(){
				batesman c;
				c.setdata();
				c.setbatsmandata();
				c.getsmandata();
			}

