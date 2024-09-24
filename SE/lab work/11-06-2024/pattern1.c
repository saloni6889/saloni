#include<stdio.h>
main()
{
	int i,j,k,num;
	printf("enter the num:");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		for(j=num;j>=i;j--)
		{
			printf(" ");
		}
			for(k=1;k<=i;k++)
			{
				printf("*");
			}
			for(k=2;k<=i;k++)
			{
				printf("*");
			}
	
				printf("\n");
			}
			for(i=2;i<=num;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
			for(k=num;k>=i;k--)
			{
				printf("*");
			}
			for(k=num-1;k>=i;k--)
			{
				printf("*");
			}
	
				printf("\n");
			}
	}

