#include<stdio.h>
main()
{
	int i,j,k,num;
	printf("enter the num:");
	scanf("%d",&num);
	for(i=1;i<=5;i++)
	{
		for(k=num;k>=i;k--)
		{
		printf(" ");
	    }
		
			for(j=1;j<=i;j++)
			{
			printf("* ");
		    }
		    printf("\n");
		}
	}

