//17.Write a C program to check whether a triangle can be formed with the given
//values for the angles.
#include<stdio.h>
main()
{
	int a1,a2,a3;
	printf("enter the a1:");
	scanf("%d",&a1);
	printf("enter the a2:");
	scanf("%d",&a2);
	printf("enter the a3:");
	scanf("%d",&a3);
	if((a1+a1>a3)&&(a2+a3>a1)&&(a3+a1>a2))
	{
		printf("triangle can be formed with the given values for the angle:");
	}
	else
	{
		printf("triangle can not be formed with the given values for the angle");
	}
}
