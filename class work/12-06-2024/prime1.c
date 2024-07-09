#include<stdio.h>
main()
{
	int i,n,c=0;
	printf("enter the num:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
	if(n%i==0)
	{
		c++;

	}
  }
  	if(c==2)
	{
		printf("num is prime num:");
	}
		else
		 {
		printf("num is not prime:");
	}

}
