//9. Write a Program of Two 1D Matrix Addition using Operator Overloading 

#include<iostream>
using namespace std;
class oneDMAtrix{
	private:
		int a[5];//1D array
		public:
			
			//function to assien array value
		 Array(int bb[]){
		 	int i=0;
		 	for(i=0;i<5;i++){
		 	a[i]=bb[i];
		 	cout<<a[i]<<"\t";
			 }
			  cout<<endl;
		 } 
		 
		 
		 
		 //operatore overloading 
		 oneDMAtrix operator+(oneDMAtrix t){
		 	oneDMAtrix temp;
		 	int i=0;
		 	cout<<endl<<"Addition of two 1 D matrix is :"<<endl;
		 	for(i=0;i<5;i++){
		 	temp.a[i]=a[i]+t.a[i];
		 	cout<<temp.a[i]<<"\t";
			 }
		 	
		 }
		
};
main(){
	int g[]={33,22,6,4,7};
	int h[]={45,2,11,4,8};
oneDMAtrix a,b,c;
a.Array(g);
b.Array(h);
c=a+b;

}
