#include<stdio.h>
main()
{
	int i,j,num,num1;
	printf("enter num :");
	scanf("%d",&num);
	for(i=1;i<=5;i++)
	{
		num1=1;
		for(j=1;j<=i;j++)
		{
			printf("%d",num1);
			num1++;
		}
		printf("\n");
	}
}
