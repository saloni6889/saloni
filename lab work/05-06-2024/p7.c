#include<stdio.h>
main()
{
	int a,b,c;
	printf("enter A:");
	scanf("%d",&a);
	printf("enter B:");
	scanf("%d",&b);
	if (a>b && b>c)
	{
		printf("%d is gretest a",a);
	}
	else if (b>a && c>b)
	{
		printf("%d is gretest b",b);
	}
	else
	{
		printf("%d is gretest c",c);
	}
}
