#include<iostream>
using namespace std;
class student{
	protected:
		int roll;
};
	class test:virtual public student
	{
		protected:
			int marks1,marks2;
			test(int m1,int m2):marks1(m1),marks2(m2){
			}void show()
	}
	{
		cout<<"The marks are "<<marks1<<"&"<<marks2<<endl;
	}
};
 
class Sports:virtual public Student
{
    protected:
        int score;
        Sports(int s):score(s) {}
        void show()
        {
            cout<<"Score = "<<score<<endl;
        }
};
 
class Result:public Test,Sports
{
    public:
    Result(int r,int m1,int m2,int s) : Test(m1,m2),Sports(s) 
    {
        roll = r;   
    }
    void show()
    {
        cout<<"Roll : "<<roll<<endl;
        Test::show();
        Sports::show();
        cout<<"Total Marks : "<<marks1+marks2+score<<endl;
    }
};
 
int main()
{   
    Result *r = new Result(4,90,95,75);
    r->show();
    return 0;   
}
