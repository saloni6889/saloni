//3. WAP to take 10 no. Input from user find out below values
//a. How many Even numbers are there
//b. How many odd numbers are there
//c. Sum of even numbers
//d. Sum of odd numbers
#include<stdio.h>
main()
{
	int i,num1,num2=10;
	for(i=1;1<=num2;i++)
	{
	  printf("enter the num:");
	  scanf("%d",&num1);
    
    if(num1==0)
	{
		printf("num is zero:");
	}
	else if(num1%2==0)
	{
		printf("num is even:");
	}
	else 
	{
		printf("num is odd:");
	}
}
}
