//10.Write a program you have to make a summation of first and last Digit. (E.g.,
//1234 Ans: -5)
#include<stdio.h>
main()
{
	int i,num=0,sum=0,rem,last_digits,first_digits;
	printf("enter the digits:");
	scanf("%d",&num);
	last_digits=num%10;
	do
	{
		rem=num%10;
		num=num/10;
		if(num==0)
		{
		first_digits=rem;
	}
	i++;
}while(num!=0);
printf("sum of last and first digits is %d",first_digits+last_digits);
}
