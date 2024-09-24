//24. 1 + 2 + 3 + 4 + 5 + ... + n
#include<stdio.h>
main()
{
	int i,num,sum=0;
	printf("enter the digits:");
	scanf("%d",&num);
	{
	  for(i=0;i<=num;i++)
	  sum+=i;
    }
      printf("Addition:%d",sum);
}

