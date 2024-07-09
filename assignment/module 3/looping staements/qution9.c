//9. Write a program make a summation of given number (E.g., 1523 Ans: -11).
#include<stdio.h>
main()
{
	int n1,sum=0,rem,i=0;
	printf("enter the num:");
	scanf("%d",&n1);
	while(n1!=0)
	{
	rem=n1%10;
	n1=n1/10;
	sum+=rem;
	i++;
    }
printf("summation of given num:%d",sum);
}
