#include<stdio.h>
main()
{
	int i,j,num,num1;
	printf("enter num :");
	scanf("%d",&num);
	for(i=1;i<=5;i++)

	{
		num1=65;
		for(j=1;j<=i;j++)
		{
			printf("%c",num1);
			num1++;
		}
		printf("\n");
	}
}
