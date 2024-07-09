#include<stdio.h>
main()
{
	int i=1,j,k;
	while(i<=5)
	{
		j=1;
		while(j<=5-i)
		{
			printf(" ");
			j++;
	    }
	    k=1;
		while(k<=i)
		{
			printf("* ");
			k++;
		}
		i++;
		printf("\n");
	}
}
