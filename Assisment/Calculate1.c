//**Create menu driven calculator using function
#include<stdio.h>
add()
{
	int a,b;
	printf("enter the Num A:");
	scanf("%d",&a);
	printf("enter the num B:");
	scanf("%d",&b);
	printf("\nsum=%d",a+b);
}
sub()
{
	int a,b;
	printf("enter the Num A:");
	scanf("%d",&a);
	printf("enter the num B:");
	scanf("%d",&b);
	printf("\nsum=%d",a-b);
}
mul()
{
	int a,b;
	printf("enter the Num A:");
	scanf("%d",&a);
	printf("enter the num B:");
	scanf("%d",&b);
	printf("\nsum=%d",a*b);
}
div()
{
	int a,b;
	printf("enter the Num A:");
	scanf("%d",&a);
	printf("enter the num B:");
	scanf("%d",&b);
	printf("\nsum=%d",a/b);
}
main()
{
	int choice;
	while(choice!=5)
	{
	printf("\n******Welcome our Calculater********:");
	   printf("\npree 1 for Addition:\n");
       printf("\npree 2 for Subtraction:\n");
	   printf("\npree 3 for Multiplication: \n");
	   printf("\npree 4 for Division:\n");
	   printf("\n 5 exit:\n");
	   printf("Enter the choice :");
	   scanf("%d",&choice);
    if(choice==1)
	{
		printf("\n******Addition\n*******");
	add();
		
	}	   
	else if(choice==2)
	{
		printf("\n*****Subtraction\n******");
		sub();
	}
	else if(choice==3)
	{
		printf("\n******Multiplication*****\n");
		mul();
	}
	else if(choice==4)
	{
		printf("\n*******Division*******\n");
		div();
	}
		else if(choice==5)
	{
		printf("\n*******exit*******\n");
		
	}
} }
