//8. Write a program to find out the max from given number (E.g., No: -1562
//Max number is 6).
#include<stdio.h>
main()
{
	int n1,i,max_n=0,rem;
	printf("enter the num:");
	scanf("%d",&n1);
	while(n1!=0)
	{
		rem=n1%10;
		n1=n1/10;
		if(rem>max_n)
		{
			max_n=max_n;
		}
		i++;
	}
	printf("max num is %d",max_n);
}
