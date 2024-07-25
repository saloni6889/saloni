//5. Assume that the test results of a batch of students are stored in three different
//classes. Class Students are storing the roll number. Class Test stores the
//marks obtained in two subjects and class result contains the total marks
//obtained in the test. The class result can inherit the details of the marks
//obtained in the test and roll number of students. (Multilevel Inheritance).
#include<iostream>
using namespace std;
class students{
	protected:
		string name;
		int roll;
		public:
		void setdata2(){
			name="saloni\t";
			roll=22;
		};
		void getdata(){
			cout<<"name:"<<name<<"\n";
			cout<<"roll:"<<roll<<"\n";
		}
};
class test:public students{
	protected:
		int maths;
		int science;
		public:
			void setdata3(){
				maths=70;
				science=80;
		}
			void getdata3(){
				cout<<"math:"<<maths<<"\n";
				cout<<"science:"<<science<<"\n";
			}
};
class result:public test{
	protected:
		int total;
		public:
			void setdata1(){
			setdata3();
			total=maths+science;}};
			
main()
{
	cout<<"**********Your Result******************\n";
test t;
t.setdata2();
t.getdata();
t.setdata3();
t.getdata3();

	
}
