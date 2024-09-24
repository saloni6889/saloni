//1. Write a program to find out the max number from given array using function.
#include<stdio.h>
max_num()
{
	int i;
	int a[4]={1,2,3,4};
	int max=a[0];
	for(i=1;i<4;i++)
	{
		if(max<a[i])
		max=a[i];
		
	}
	printf("max num %d",max);
}
main()
{
	max_num();
}

	
