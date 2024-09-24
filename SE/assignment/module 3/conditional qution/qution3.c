//3. WAP to check if the given year is a leap year or not.
#include<stdio.h>
main()
{
	int year;
	printf("enter year");
	scanf("%d",&year);
	if(year%4==0 && year%100==0)
	{
		printf("leap year");//leap year/4 and not year/100
	}
	else
	{
		printf("not leap year");
	}
}
