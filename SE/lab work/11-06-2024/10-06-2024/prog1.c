#include<stdio.h>
main()
{
	int i,j,row;
	printf("enter num of row");
	scanf("%d",&row);
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}
