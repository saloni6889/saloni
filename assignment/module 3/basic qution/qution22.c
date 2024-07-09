//22. Calculate compound interest (Compound Interest formula:
//a. Formula to calculate compound interest annually is given by:
//Amount= P(1 + R/100)t
//b. Compound Interest = Amount – P
#include<stdio.h>
#include<math.h>
main()
{
	int p,r,n,ci;
	printf("enter the principle amount:");
	scanf("%d",&p);
	printf("enter the rate:");
	scanf("%d",&r);
	printf("enter the num of year:");
	scanf("%d",&n);
	int amount=p*((float)(1+(float)r/100));
	int final_amount=pow(amount,n);
	printf("%d\n",final_amount);
	ci=final_amount-p;
	printf("compound interset is %d",ci);
}

