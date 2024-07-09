//4. WAP to make simple calculator (operation include Addition, Subtraction,
//Multiplication, Division, modulo) using conditional statement
#include<stdio.h>
main()
{
	int n,n1,n2;
	printf("enter the numbers:");
	scanf("%d",&n);
	printf("enter n1");
	scanf("%d",&n1);
	printf("enter n2");
	scanf("%d",&n2);
    if(n==1);
	{
		printf("addition num of:%d",n1+n2);
	}
     if(n==2)
	{
		printf("substraction num of:%d",n1-n2);
	}
	if(n==3)
	{
		printf("multiplication num of:%d",n1*n2);
	}
	if(n==4)
	{
		printf("division num of:%f",(float)n1/n2);
	}
	printf("\n");
}
