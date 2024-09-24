//26. (1)+ (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n)
#include<stdio.h>
main()
{
	int i,j,num,sum=0;
	printf("enter the digits:");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		int start=1;
		for(j=1;j<=i;j++)
		{
			sum+=start;
			start++;
		}
	}
		printf("Addition:%d",sum);
	
}

