#include<stdio.h>
fact()
{
	int n,fact=1,i;
	printf("enter num:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		fact*=i;
	}
	return fact;
}
main()
{
	printf("%d",fact());
}
