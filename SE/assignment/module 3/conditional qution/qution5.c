//5. Check Number Is Positive or Negative
#include<stdio.h>
main()
{
	int number;
	printf("enter value of number:");
	scanf("%d",&number);
	if(number==0)
	{
		printf("num is zero");
	}
	else if(number>0)
	{
		printf("num is positive");
	}
	else
	{
		printf("num is nagative");
	}
	
}
