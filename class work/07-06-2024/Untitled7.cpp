#include<stdio.h>
main()
{
	int i,n,fact=1;
	printf("enter the num:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
		{
			fact*=i;
		}
		printf("%d",fact);
	
}
