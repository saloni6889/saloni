//7. Accept marks from user and check pass or fail
#include<stdio.h>
main()
{
	float marks;
	printf("enter the marks:");
	scanf("%f",&marks);
	if(marks>=33 && marks<=100)
	{
		printf("you are pass");
	}
	else if(marks<=33 && marks>=0)
	{
		printf("you are fail");
	}
	else
	{
		printf("enter the valid marks");
	}
}
