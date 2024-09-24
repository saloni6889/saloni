//18.Write a C Program to Print the Multiplication Table of N.
#include<stdio.h>
main()
{
	int num,i;
	printf("enter the multiplication table:");
	scanf("%d",&num);
	for(i=1;i<=10;i++)
	{
		printf("%d*%d=%d\n",num,i,num*i);
		
	}
}
