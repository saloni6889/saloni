#include<stdio.h>
main()
{
	int n,i,a=0,b=1,c;
	printf("Enter the num:");
	scanf("%d,",&n);
	for(i=1;i<=n;i++)
	{
		printf("%d",a);
		c=a+b;
		a=b;
		b=c;
	}
}
