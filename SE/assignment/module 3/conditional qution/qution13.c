//13.WAP to find minimum number among 3 numbers using ternary operator.
#include<stdio.h>
main()

{
	int n1,n2,n3;
	printf("enter n1:");
	scanf("%d",&n1);
	printf("enter n2:");
	scanf("%d",&n2);
	printf("enter n3");
	scanf("%d",&n3);
	(n1>n2)?n1>n3?printf("n3 is minimum"):printf("n1 is minimum"):
		n2>n3?printf("n3 is minimum"):printf("n2 is minimum");
}
