#include<stdio.h>
prime()
{
	int n,count=0,i;
	printf("enter num:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
          count++;
        }
	}
	if(count==2)
	{
		printf("num is prime:");
	}
	else
	{
	  printf("num is not prime:");
    }
}
main()
{
    printf("prime function:");
    prime();
}
