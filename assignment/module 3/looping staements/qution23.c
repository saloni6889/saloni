//23. C Program to Reverse a Number Using FOR Loop
//Series Program:
#include<stdio.h>
main()
{
	int num,i,rev;
	printf("enter the num:");
	scanf("%d",&num);
	for(i=1;num!=0;i++)
	{
		rev=num%10;
		num=num/10;
		printf("%d",rev);
	}
}
