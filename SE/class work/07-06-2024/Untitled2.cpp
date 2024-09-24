#include<stdio.h>
main()
{
	int i,j,k,n=5;
	for(i=0;i<n;i++)
	{
		for(j=5;j>i;j--)
		printf(" ");
		{
			for(k=0;k<i;k++)
			printf("* ");
		}
		printf("\n");
	}
}
