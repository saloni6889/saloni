#include<stdio.h>
main()
{
	int i,j,k,l,num;
	printf("enter the num:");
	scanf("%d",&num);
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
			for(k=num;k>=i;k--)
			{
				printf("*");
			}
				for(l=num;l>=i;l--)
			{
				printf("*");
			}
			
	
				printf("\n");
			}
	}

