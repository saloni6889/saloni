//6. WAP to make addition, Subtraction and multiplication of two matrix using
//2-D Array.
#include<stdio.h>
main()
{
	int a[2][2],b[2][2];
	int i,j;
	printf("enter value of array a: \n");
	
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
//				printf("enter num a\n");
				scanf("%d",&a[i][j]);
			}
		}
			for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				printf("enter num are%d",a[i][j]);
			}
		}
		
		
			printf("enter value of array a: \n");
	
			for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			
				scanf("%d",&b[i][j]);
			}
//			printf("\n");
		}
		printf("addition\n");
			int sum;
			for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			printf("%d\t",a[i][j]+b[i][j]);
			}
			printf("\n");
		}
		printf("multiplication\n");
		int mul;
			for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			printf("%d\t",a[i][j]*b[i][j]);
			}
			printf("\n");
		}
		printf("subtraction\n");
		int sub;
			for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			printf("%d\t",a[i][j]-b[i][j]);
			}
			printf("\n");
		}
	}
