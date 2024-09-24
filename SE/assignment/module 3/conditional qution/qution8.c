//8. WAP to accept the height of a person in centimeters and categorize the
//person according to their height.
#include<stdio.h>
main()
{
	float height;
	printf("enter the hight:");
	scanf("%d",&height);
	if(height<150)
	{
		printf("smaller");
	}
	else if (height<150 && height>170)
	{
		printf("avrage");
	}
	else 
	{
		printf("taller");
	}
}
