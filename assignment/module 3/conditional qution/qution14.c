//14.WAP to find the largest of three numbers.
#include<stdio.h>
main()
{
	int n1,n2,n3;
	printf("enter the num :");
	scanf("%d",&n1);
	printf("enter the num :");
	scanf("%d",&n2);
	printf("enter the num :");
	scanf("%d",&n3);
	if(n1>n2 && n2>n3)
	{
		printf("%d is gratest n1:",n1);
	}
	if(n2<n1 && n3<n2)
	{
		printf("%d is gretest n2:",n2);
	}
	else
	{
		printf("%d is gretest c:",n3);
	}
}
