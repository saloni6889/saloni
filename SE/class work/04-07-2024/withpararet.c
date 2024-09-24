#include<stdio.h>
fact (int n)
{
	int fact=1,i;
	for(i=1;i<=n;i++)
	{
		fact*=i;
	}
	return fact;
}
main()
{
	int n;
	printf("enter num:");
	scanf("%d",&n);
	printf("%d",fact(n));
}
