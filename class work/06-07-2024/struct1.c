#include<stdio.h>
struct info
{
	int a;
	int b;
	
}s1;
main()
{
	printf("enter the a:");
	scanf("%d",&s1.a);
	printf("enter the b:");
	scanf("%d",&s1.b);
	printf("%d\t",s1.a);
    printf("%d\t",s1.b);
}


