//24.Accept 5 employees name and salary and count average and total salary
#include<stdio.h>
main()
{
	char name[5][12];
	int salary[5],i,total=0;
	for(i=0;i<5;i++)
	{
		printf("enter the employee %d:",i+1);
		gets(name[i]);//name of employee
//			getchar();
		printf("the %s salary is :",name[i]);
		scanf("%d",&salary [i]);//salary of employee
		getchar();
		
	}
	for(i=0;i<5;i++)
	{
		printf("enter the employee:%s\n",name[i]);//print the name of array
	}
	printf("\ntotal:%d",total);
	printf("\naverage:%f",(float)total/5);
}

