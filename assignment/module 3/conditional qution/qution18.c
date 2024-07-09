//18. Write a C program to calculate profit and loss on a transaction.
#include<stdio.h>
main()
{
	int o_price,s_price,diffrence;
	printf("enter the o price:");
	scanf("%d",&o_price);
	printf("enter the s price:");
	scanf("%d",&s_price);
	if (diffrence==0)
	{
		printf("there is not profit or loss:");
	}
	else if(diffrence>=0)
	{
		printf("there is profit:");
	}
	else
	{
		printf("there is loss:");
	}
}
