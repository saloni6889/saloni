//12. Program of Armstrong Number in C Using For Loop & While Loop.
#include<stdio.h>
main()
{
	int n,d=0,r,p,sum=0;
	int i,j;
	printf("enter a num:");
	scanf("%d",&n);
	for(i=n;i>0;i=i/10)
	d++;

	for(i=n;i>0;i=i/10)
	{
		r=i%10;
		p=1;
		for(j=1;j<=d;j++)
		p*=r;
		sum+=p;
	}
	if(sum==n)
	printf("\n %d is an armstrong num :\n",n);
	else
	printf("\n %d is not an armstrong num:\n",n);
}
