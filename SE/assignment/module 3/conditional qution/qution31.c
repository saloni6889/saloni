///31. Write a program in C to read any Month Number in integer and display the
//number of days for this month.
#include<stdio.h>
main()
{
	int m_num;
	printf("enter the mounth num from 1 to 12:");
	scanf("%d",&m_num);
	if(m_num<0||m_num>12)
	{
		printf("enter the valid num:");
	}
	else if (m_num==4||m_num==6||m_num==9||m_num==11)
	{
		printf("30 days");
	}
	else if(m_num==2)
	{
		printf("28/29 days");
	}
	else
	{
		printf("31 days");
	}
}
