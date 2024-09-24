//4. WAP to print table up to given numbers
#include<stdio.h>
main()
{
	int n,i;
	printf("enter num:");
	scanf("%d",&n);
	for(i=1;i<=5;i++)
	{
		printf("%d*%d=%d\n",n,i,i*n);
	}
}
