//21.Accept 2 numbers from user and swap 2 numbers with using 3rd variable
//and without using 3rd variable.
#include<stdio.h>
main()
{
	int n1,n2,temp;
	printf("enter the n1:");
	scanf("%d",&n1);
	printf("enter the n2:");
	scanf("%d",&n2);
	//using third variable
	temp=n1;
	n1=n2;
	n2=temp;
	printf("after the swapping n1:%d\n",n1);
	printf("after the swaping n2:%d\n",n2);
	//without using third variable
	n1=n1+n2;
	n2=n1-n2;
	n1=n1-n2;
	printf("without third variable n1:%d\n",n1);
	printf("without third variable n2:%d\n",n2);
}
