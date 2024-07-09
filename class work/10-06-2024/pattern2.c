#include<stdio.h>
main()
{
	int i,j,row;
	printf("enter of row");
	scanf("%d",&row);
	for(i=1;j<=row;i++)
	{
	for(j=1;j<=i;j++)
	{
	printf("*");
    }
	printf("\n");
  }
}
