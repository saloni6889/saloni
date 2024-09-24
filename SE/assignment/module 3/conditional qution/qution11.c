//11.WAP to find number is even or odd using ternary operator.
#include<stdio.h>
main()
{
	int n,num;
	printf("enter the num:");
	scanf("%d",&n);
	if(n==0)
	{
		printf("num is zero:");
	}
	else if(n%2==0)
	{
		printf("num is even:");
	}
	else 
	{
		printf("num is odd:");
	}
}
