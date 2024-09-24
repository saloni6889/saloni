//25. (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n)
#include<stdio.h>
main()
{
	int i,num,sum=0;
	printf("enter the digits:");
	scanf("%d",&num);
	for(i=0;i<=num;i++)
	{
		sum+=(i*i);
	}
	printf("Addittion:%d",sum);
}
