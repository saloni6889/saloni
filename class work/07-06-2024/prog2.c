//for loop for factorial
#include<stdio.h>
main()
{
	int n,i,fact=0;
	printf("enter num :");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
	fact+=i;
    }
	printf("%d",fact);
}
