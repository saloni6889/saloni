#include<stdio.h>
main()
{
	int a[4];
	int i,j;
	printf("enter 4 num:");
	for(i=0;i<4;i++)
	{
		for(j=i+1;j<4;j++)
		{
			int temp;
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[i];
				a[j]=a[j];
			}
		}
		printf("%d",a[i]);
	}
}
