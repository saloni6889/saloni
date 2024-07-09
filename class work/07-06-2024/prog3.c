//while loop for factorial
#include<stdio.h>
main()
{
	int n,i,fact=1;
	printf("enter num:");
	scanf("%d",&n);
	i=1;
	while(i<=n)
	{
	  fact*=i;
	  i++;	
	}
	printf("%d",fact);
}
