//20.Accept monthly salary from the user and deduct 10% insurance premium,
//10% loan installment find out of remaining salary.*/
#include<stdio.h>
main()
{
	int salary,ip,li;
	printf("enter the salary:");
	scanf("%d",&salary);
	ip=salary*10/100;
	li=salary*10/100;
	printf("remaining salary:%d",salary-li-ip);
}
