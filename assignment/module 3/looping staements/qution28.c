//28. 1 2 3 6 9 18 27 54...
#include<stdio.h>
main()
{
	int i,num,n1=1,n2;
	printf("enter the digits:");
	scanf("%d",&num);
	printf("%d\t",n1);
	for(i=1;i<=num;i++)
	{
	  if(i%2!=0)
	   {
		  n2=n1*2;
		  n1=n2;
		  printf("%d\t",n2);
	   }
	    else
	     {
	    	n2=n1*1.5;
		    n1=n2;
		    printf("%d\t",n2);
	     }
    }
}
