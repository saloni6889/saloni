//15.Calculate sum of 10 numbers using of while loop.
#include<stdio.h>
main()
{
	int i,sum=0,num;
	printf("enter the num:");
	scanf("%d",&num);
	i=num;
	while(i<=num+9)
	{
		sum=sum+i;
		i++;
	}
	printf("%d",sum);
}
