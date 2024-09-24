#include<stdio.h>
main()
{
	int i,j,k,num,num1;
	printf("enter the num:");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
	    num1=1;
		for(j=1;j<=i;j++)
		{
		if(j%2==0)
	    	{
			printf("0");
	    	}
	    	else{
		        	printf("1");
		        }
	    }
		printf("\n");
	}
}
