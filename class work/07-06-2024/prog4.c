//create a table using for loop
#include<stdio.h>
main()
{
	int n,i;
	printf("enter num:");
	scanf("%d",&n);
	for(i=1;i<=10;i++)
	{
	  printf("%d*%d=%d\n",n,i,i*n);
    }
}
