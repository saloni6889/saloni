#include<stdio.h>
main()
{
	int n;
	printf("enter numbers");
	scanf("%d",&n);
	if(n==0)
	{
		printf("num is zero");
	}
	else if(n>0)
	{
		printf("num is positive");
	}
	else
	{
		printf("num is negative");
	}
}
