//16. Calculate the Sum of Natural Numbers Using the While Loop.
#include<stdio.h>
main()
{
	int num,sum=0,i=1;
	printf("enter the num:");
	scanf("%d",&num);
	while(i<=num);
	{
		sum=sum+i;
		i++;
	}
	printf("sum of num :%d",sum);
}

