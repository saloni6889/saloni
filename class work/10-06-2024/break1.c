#include<stdio.h>
main()
{
	int n,i;
	printf("enter the num :");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i==10)
		{
			break;
		}
		printf("%d\n",i);
	}
	
}
