#include<stdio.h>
add()
{
	int a,b;
	printf("enter the A:");
	scanf("%d",&a);
	printf("\n enter the B:");
	scanf("%d",&b);
	printf("\n addition:%d",a+b);
}
sub()
{
	int a,b;
	printf("enter the A:");
	scanf("%d",&a);
	printf("\n enter the B:");
	scanf("%d",&b);
	printf("\n substraction:%d",a-b);  
}
mul()
{
	int a,b;
	printf("enter the A:");
	scanf("%d",&a);
	printf("\n enter the B:");
	scanf("%d",&b);
	printf("\n multiplication:%d",a*b);
}
main()
{
	add();
	sub();
	mul();
	
}
