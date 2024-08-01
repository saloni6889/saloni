#include<stdio.h>
sum()
{
	int a[4];
	int i,sum=0;
	for(i=0;i<4;i++)
	{
		printf("enter the elements:");
		scanf("%d",a[i]);
	}
	for(i=0;i<4;i++)
	{
		sum+=a[i];
	}
	printf("%d");
}
main()
{
  sum();	
}
