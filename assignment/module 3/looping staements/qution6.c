//6. WAP to print Fibonacci series up to given numbers.
#include<stdio.h>
main()
{
	int n1=0,n2=1,n3,i,n;
		printf("enter the fibonacci num:");
		scanf("%d",&n);
		printf("%d\n",n1);
		printf("%d\n",n2);
		for(i=2;i<=n;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			printf("%d\n",n3);
		}
}
