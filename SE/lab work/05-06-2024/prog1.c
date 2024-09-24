#include<stdio.h>
main()
{
	int  n;
	printf("enter age");
	scanf("%d",&n);
	if(n>=100)
	{
		printf("invalid age");
	}
	else if (n>=18)
	{
		printf("valid for vote");
	}
	else
	{
		printf("no eligible for vote");
	}
}
