#include<stdio.h>
main()
{
	int i,j,k,row;
	printf("enter the row:");
	scanf("%d",&row);
	for(i=1;i<=0;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		for(k=row;k<=i;k--)
		{
			printf("*");
		}
		printf("\n");
	}
}
