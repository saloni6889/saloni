#include<stdio.h>
main()
{
	int i,j,k,num;
	printf("enter the value :");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
	   for(k=num;k>=i;k--)
	   {
	   printf(" ");
       }
	   	for(j=1;j<=i;j++)
	   	{
	   	printf("*");
	    }
		printf("\n");
	}
}
