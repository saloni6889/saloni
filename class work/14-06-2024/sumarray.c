#include<stdio.h>
main()
{
	int a[4];
	int i,sum=0;
	for(i=0;i<4;i++)
	{
		printf("\nenter the elemente: ");
		scanf("%d",&a[i]);
	}
		for(i=0;i<4;i++)
	{
       sum+=a[i];	
	}
printf("%d",sum);
}
