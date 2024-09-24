#include<stdio.h>
main()
{
	int i,j,k,num,num1;
	printf("enter the value :");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
	   num1=65;
	   for(k=num;k>=i;k--)
	   {
	   printf(" ");
       }
	   	for(j=1;j<=i;j++)
	   	{
	   	printf("%c",num1);
	   	num1++;
	    }
		printf("\n");
	}
}
