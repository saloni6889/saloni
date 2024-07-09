//27. 1/2 - 2/3 + 3/4 - 4/5 + 5/6 ..........n
#include<stdio.h>
main()
{
	int i,j,num;
	float sum;
	printf("enter the digits:");
	scanf("%d",&num);
	int n1=1;
	for(i=1;i<num;i++)
	{
		if(i%2==0)
		{
			sum-=(float)i/(i+1);
		}
	      else
	      {
	      	sum+=(float)i/(i+1);
		  }
		  n1++;
	}
	printf("Addition:%f\n",sum);
}
