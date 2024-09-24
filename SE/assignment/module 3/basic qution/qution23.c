//23.WAP to calculate swap 2 numbers with using of multiplication and division.
#include<stdio.h>
main()
{
	int a,b,temp;
	printf("enter the num A:");
	scanf("%d",&a);
	printf("enter the num B:");
	scanf("%d",&b);
	temp=a;
	a=b;
	b=temp;
	{
		printf("after the swaping num A:%d",a);
		printf("after the swaping num B:%d",b);
	}
}
