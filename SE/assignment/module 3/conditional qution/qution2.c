//2. Write a C program to read the value of an integer m and display the value of
//n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0
#include<stdio.h>
main()
{
	int m;
	printf("enter the num :");
	scanf("%d",&m);
	if(m>0)
	{
		printf("n=1");
	}
	else
	{
		printf("n=0");
	}
}
