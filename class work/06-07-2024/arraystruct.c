#include<stdio.h>
struct info
{
	int a[4];
    int	b[4];
	int i;
}s1;
main()
{
	for(s1.i=0;s1.i<4;s1.i++)
	{
		printf("enter the element a:");
		scanf("%d",&s1.a[s1.i]);
	}
	for(s1.i=0;s1.i<4;s1.i++)
	{
	printf("enter the element b:");
	scanf("%d",&s1.b[s1.i]);
}
printf("sum of array:");
for(s1.i=0;s1.i<4;s1.i++)
{
	printf("%d\n",s1.a[s1.i]+s1.b[s1.i]);
}
printf("\n");
}
